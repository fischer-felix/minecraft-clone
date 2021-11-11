package client.render.vk.device;

import client.render.vk.device.queue.VulkanQueueFamilies;
import client.render.vk.instance.VulkanInstance;
import client.render.vk.surface.VulkanSurface;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.*;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import static client.render.vk.debug.VulkanDebug.vkCheck;
import static org.lwjgl.vulkan.VK10.*;

public class VulkanPhysicalDevice {
    private static final String[] requiredDeviceExtensionNames = new String[]{
            KHRSwapchain.VK_KHR_SWAPCHAIN_EXTENSION_NAME
    };

    private final VkPhysicalDevice device;
    private final int score;

    private VulkanQueueFamilies queueFamilies;

    private PointerBuffer requiredExtensions;
    private VkPhysicalDeviceFeatures requiredFeatures;
    private VkPhysicalDeviceProperties properties;

    public VulkanPhysicalDevice(MemoryStack stack, VulkanInstance instance, long aPhysicalDevice, VulkanSurface surface) {
        device = new VkPhysicalDevice(aPhysicalDevice, instance.getInstance());
        score = checkDevice(stack, surface);
    }

    public static VulkanPhysicalDevice pickPhysicalDevice(MemoryStack stack, VulkanInstance instance, VulkanSurface surface) {
        // Enumerate physical device count which supports vulkan
        IntBuffer pPhysicalDeviceCount = stack.mallocInt(1);
        vkCheck(vkEnumeratePhysicalDevices(instance.getInstance(), pPhysicalDeviceCount, null), "Failed to enumerate physical device count");
        int physicalDeviceCount = pPhysicalDeviceCount.get(0);
        pPhysicalDeviceCount.position(0);

        if (physicalDeviceCount == 0) {
            throw new RuntimeException("Failed to find graphics device that supports vulkan");
        }

        SortedMap<Integer, VulkanPhysicalDevice> physicalDevices = new TreeMap<>();

        PointerBuffer pPhysicalDevices = stack.mallocPointer(physicalDeviceCount);
        vkCheck(vkEnumeratePhysicalDevices(instance.getInstance(), pPhysicalDeviceCount, pPhysicalDevices), "Failed to enumerate physical devices");
        for (int physicalDeviceIndex = 0; physicalDeviceIndex < pPhysicalDevices.capacity(); physicalDeviceIndex++) {
            VulkanPhysicalDevice physicalDevice = new VulkanPhysicalDevice(stack, instance, pPhysicalDevices.get(physicalDeviceIndex), surface);

            // Rate every physical device based on its features
            physicalDevices.put(physicalDevice.getScore(), physicalDevice);
        }

        int bestDeviceScore = physicalDevices.firstKey();
        if (bestDeviceScore == 0) {
            throw new RuntimeException("No suitable graphics device found");
        }

        return physicalDevices.get(bestDeviceScore);
    }

    private int checkDevice(MemoryStack stack, VulkanSurface surface) {
        int score = 0;

        int extensionScore = checkDeviceExtensions(stack);
        if (extensionScore < 0) {
            return 0;
        }
        score += extensionScore;

        int featureScore = checkDeviceFeatures(stack);
        if (featureScore < 0) {
            return 0;
        }
        score += featureScore;

        int propertiesScore = checkDeviceProperties(stack);
        if (propertiesScore < 0) {
            return 0;
        }
        score += propertiesScore;

        int queueFamiliesScore = checkQueueFamilies(stack, surface);
        if (queueFamiliesScore < 0) {
            return 0;
        }
        score += queueFamiliesScore;

        return score;
    }

    private int checkDeviceExtensions(MemoryStack stack) {
        // Enumerate physical device extension count
        IntBuffer pDeviceExtensionCount = stack.mallocInt(1);
        vkCheck(vkEnumerateDeviceExtensionProperties(device, (String) null, pDeviceExtensionCount, null), "Failed to enumerate physical device extension count");
        int deviceExtensionCount = pDeviceExtensionCount.get(0);

        // Enumerate physical device extensions
        VkExtensionProperties.Buffer pDeviceExtensions = VkExtensionProperties.malloc(deviceExtensionCount, stack);
        vkCheck(vkEnumerateDeviceExtensionProperties(device, (String) null, pDeviceExtensionCount, pDeviceExtensions), "Failed to enumerate physical device extensions");

        List<String> deviceExtensions = new ArrayList<>(deviceExtensionCount);

        // Gather device extension names
        for (int deviceExtensionIndex = 0; deviceExtensionIndex < deviceExtensionCount; deviceExtensionIndex++) {
            deviceExtensions.add(pDeviceExtensions.get(deviceExtensionIndex).extensionNameString());
        }

        // Check if all required extensions are available
        requiredExtensions = stack.mallocPointer(requiredDeviceExtensionNames.length);
        for (String requiredDeviceExtension : requiredDeviceExtensionNames) {
            if (!deviceExtensions.contains(requiredDeviceExtension)) {
                return -1; // Return device is not suitable
            }

            requiredExtensions.put(stack.ASCII(requiredDeviceExtension));
        }

        // If optional extensions are needed the score can be returned here
        return 0;
    }

    private int checkDeviceFeatures(MemoryStack stack) {
        //Get physical device features
        VkPhysicalDeviceFeatures physicalDeviceFeatures = VkPhysicalDeviceFeatures.malloc(stack);
        vkGetPhysicalDeviceFeatures(device, physicalDeviceFeatures);

        requiredFeatures = VkPhysicalDeviceFeatures.calloc(stack);

        // IMPORTANT check if feature is available at physical device and activate it through requiredFeatures
        if (!physicalDeviceFeatures.shaderClipDistance()) {
            return -1;
        }

        requiredFeatures.shaderClipDistance(true);

        // If optional features are needed the score can be returned here
        return 0;
    }

    private int checkDeviceProperties(MemoryStack stack) {
        VkPhysicalDeviceProperties physicalDeviceProperties = VkPhysicalDeviceProperties.malloc(stack);
        vkGetPhysicalDeviceProperties(device, physicalDeviceProperties);

        int score = 0;
        if (physicalDeviceProperties.deviceType() == VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU) {
            score += 1000;
        }

        properties = physicalDeviceProperties;
        return score;
    }

    private int checkQueueFamilies(MemoryStack stack, VulkanSurface surface) {
        queueFamilies = new VulkanQueueFamilies(stack, this, surface);

        if (!queueFamilies.isSuitable()) {
            return -1;
        }

        return 0;
    }

    public VkPhysicalDevice getDevice() {
        return device;
    }

    public int getScore() {
        return score;
    }

    public PointerBuffer getRequiredExtensions() {
        return requiredExtensions;
    }

    public VkPhysicalDeviceFeatures getRequiredFeatures() {
        return requiredFeatures;
    }

    public VkPhysicalDeviceProperties getProperties() {
        return properties;
    }

    public VulkanQueueFamilies getQueueFamilies() {
        return queueFamilies;
    }
}
