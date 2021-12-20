package engine.graphics.vulkan.device.queue;

import engine.collections.set.DefaultImmutableSet;
import engine.collections.set.ImmutableSet;
import engine.graphics.vulkan.device.PhysicalDevice;
import engine.graphics.vulkan.helper.function.VkFunction;
import engine.graphics.vulkan.surface.Surface;
import engine.helper.enums.Maskable;
import engine.memory.MemoryContext;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.KHRSurface;
import org.lwjgl.vulkan.VK10;
import org.lwjgl.vulkan.VkQueueFamilyProperties;

import java.nio.IntBuffer;

public class QueueFamily {
    private final int index;
    private final int count;
    private final ImmutableSet<QueueCapability> capabilities;
    private final PhysicalDevice physicalDevice;

    public QueueFamily(PhysicalDevice physicalDevice, int index, VkQueueFamilyProperties properties) {
        this.physicalDevice = physicalDevice;
        this.index = index;
        this.count = properties.queueCount();
        this.capabilities = new DefaultImmutableSet<>(Maskable.fromBitMask(properties.queueFlags(), QueueCapability.class));
    }

    public boolean hasPresentationSupport(Surface surface) {
        MemoryStack stack = MemoryContext.getStack();

        IntBuffer supportsPresentationBuffer = stack.mallocInt(1);
        VkFunction.execute(() -> KHRSurface.vkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice.getReference(), index, surface.getHandle(), supportsPresentationBuffer));

        return supportsPresentationBuffer.get(0) == VK10.VK_TRUE;
    }

    public int getIndex() {
        return index;
    }

    public int getCount() {
        return count;
    }

    public ImmutableSet<QueueCapability> getCapabilities() {
        return capabilities;
    }

    public PhysicalDevice getPhysicalDevice() {
        return physicalDevice;
    }

    @Override
    public String toString() {
        return "QueueFamily[" +
                "index=" + index +
                ", count=" + count +
                ", capabilities=" + capabilities +
                ", physicalDevice=" + physicalDevice +
                ']';
    }
}
