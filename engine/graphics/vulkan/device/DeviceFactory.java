package engine.graphics.vulkan.device;

import engine.collections.container.Container;
import engine.graphics.vulkan.device.properties.DeviceExtension;
import engine.graphics.vulkan.device.properties.DeviceFeature;
import engine.graphics.vulkan.helper.function.VkFunction;
import engine.graphics.vulkan.queue.properties.QueueContainer;
import engine.graphics.vulkan.queue.properties.QueueInfo;
import engine.memory.Buffers;
import engine.memory.EnumBuffers;
import engine.memory.MemoryContext;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VK10;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkDeviceCreateInfo;
import org.lwjgl.vulkan.VkDeviceQueueCreateInfo;
import org.lwjgl.vulkan.VkPhysicalDeviceFeatures;

import java.nio.FloatBuffer;
import java.util.List;

public class DeviceFactory {
    public static Device createDevice(PhysicalDevice physicalDevice,
                                      QueueContainer queues,
                                      Container<DeviceExtension> extensions,
                                      Container<DeviceFeature> features) {

        MemoryStack stack = MemoryContext.getStack();

        PointerBuffer extensionsBuffer = EnumBuffers.toString(stack, extensions.getRequested().toMutable());
        VkPhysicalDeviceFeatures vkFeatures = DeviceFeature.toVk(features.getRequested().toMutable());

        List<QueueInfo> requestedQueues = queues.getRequested().toMutable();
        VkDeviceQueueCreateInfo.Buffer queueBuffer = VkDeviceQueueCreateInfo.malloc(requestedQueues.size(), stack);
        for (int i = 0; i < requestedQueues.size(); i++) {
            QueueInfo queueInfo = requestedQueues.get(i);
            FloatBuffer priorities = Buffers.toFloat(stack, queueInfo.getPriorities());

            queueBuffer.get(i)
                    .sType$Default()
                    .flags(0)
                    .pNext(0)
                    .queueFamilyIndex(queueInfo.getFamily().getIndex())
                    .pQueuePriorities(priorities);
        }

        queueBuffer.position(0);

        VkDeviceCreateInfo createInfo = VkDeviceCreateInfo.malloc(stack)
                .sType$Default()
                .flags(0)
                .pNext(0)
                .ppEnabledExtensionNames(extensionsBuffer)
                .pEnabledFeatures(vkFeatures)
                .pQueueCreateInfos(queueBuffer);

        PointerBuffer handleBuffer = stack.mallocPointer(1);
        VkFunction.execute(() -> VK10.vkCreateDevice(physicalDevice.getReference(), createInfo, null, handleBuffer));
        VkDevice handle = new VkDevice(handleBuffer.get(0), physicalDevice.getReference(), createInfo);

        return new Device(handle, physicalDevice);
    }
}
