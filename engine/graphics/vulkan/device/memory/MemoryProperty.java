package engine.graphics.vulkan.device.memory;

import engine.helper.enums.Maskable;
import org.lwjgl.vulkan.VK10;

public enum MemoryProperty implements Maskable {
    DEVICE_LOCAL(VK10.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT),
    HOST_VISIBLE(VK10.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT),
    HOST_COHERENT(VK10.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT),
    HOST_CACHED(VK10.VK_MEMORY_PROPERTY_HOST_CACHED_BIT),
    LAZILY_ALLOCATED(VK10.VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT);

    private final int bit;

    MemoryProperty(int bit) {
        this.bit = bit;
    }

    @Override
    public int getBit() {
        return bit;
    }
}
