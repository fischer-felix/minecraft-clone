package engine.graphics.vulkan.device.queue;

import engine.graphics.vulkan.device.Device;
import engine.graphics.vulkan.device.PhysicalDevice;
import engine.memory.MemoryContext;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VK10;
import org.lwjgl.vulkan.VkQueue;
import org.lwjgl.vulkan.VkQueueFamilyProperties;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;

public class QueueFactory {
    public QueueContainer.Builder createQueueFamilies(PhysicalDevice physicalDevice) {
        MemoryStack stack = MemoryContext.getStack();

        IntBuffer queueFamilyCountBuffer = stack.mallocInt(1);
        VK10.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice.getReference(), queueFamilyCountBuffer, null);
        int queueFamilyCount = queueFamilyCountBuffer.get(0);

        VkQueueFamilyProperties.Buffer queueFamilyBuffer = VkQueueFamilyProperties.malloc(queueFamilyCount, stack);
        VK10.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice.getReference(), queueFamilyCountBuffer, queueFamilyBuffer);

        List<QueueFamily> queueFamilies = new ArrayList<>(queueFamilyCount);
        for (int i = 0; i < queueFamilyCount; i++) {
            queueFamilies.add(new QueueFamily(physicalDevice, i, queueFamilyBuffer.get(i)));
        }

        return new QueueContainer.Builder(queueFamilies);
    }

    public Queue createQueue(Device device, QueueFamily family, int index) {
        MemoryStack stack = MemoryContext.getStack();

        PointerBuffer handleBuffer = stack.mallocPointer(1);
        VK10.vkGetDeviceQueue(device.getReference(), family.getIndex(), index, handleBuffer);
        VkQueue handle = new VkQueue(handleBuffer.get(0), device.getReference());

        return new Queue(handle);
    }
}
