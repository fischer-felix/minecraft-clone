package engine.graphics.instance;

import engine.util.enums.HasValue;
import org.lwjgl.vulkan.KHRDisplaySwapchain;
import org.lwjgl.vulkan.KHRSurface;
import org.lwjgl.vulkan.KHRSwapchain;
import org.lwjgl.vulkan.VK10;

public enum VkResult implements HasValue<Integer> {
    SUCCESS(VK10.VK_SUCCESS),
    NOT_READY(VK10.VK_NOT_READY),
    TIMEOUT(VK10.VK_TIMEOUT),
    EVENT_SET(VK10.VK_EVENT_SET),
    EVENT_RESET(VK10.VK_EVENT_RESET),
    INCOMPLETE(VK10.VK_INCOMPLETE),
    SUBOPTIMAL(KHRSwapchain.VK_SUBOPTIMAL_KHR),

    ERROR_OUT_OF_HOST_MEMORY(VK10.VK_ERROR_OUT_OF_HOST_MEMORY),
    ERROR_OUT_OF_DEVICE_MEMORY(VK10.VK_ERROR_OUT_OF_DEVICE_MEMORY),
    ERROR_INITIALIZATION_FAILED(VK10.VK_ERROR_INITIALIZATION_FAILED),
    ERROR_DEVICE_LOST(VK10.VK_ERROR_DEVICE_LOST),
    ERROR_MEMORY_MAP_FAILED(VK10.VK_ERROR_MEMORY_MAP_FAILED),
    ERROR_LAYER_NOT_PRESENT(VK10.VK_ERROR_LAYER_NOT_PRESENT),
    ERROR_EXTENSION_NOT_PRESENT(VK10.VK_ERROR_EXTENSION_NOT_PRESENT),
    ERROR_FEATURE_NOT_PRESENT(VK10.VK_ERROR_FEATURE_NOT_PRESENT),
    ERROR_INCOMPATIBLE_DRIVER(VK10.VK_ERROR_INCOMPATIBLE_DRIVER),
    ERROR_TOO_MANY_OBJECTS(VK10.VK_ERROR_TOO_MANY_OBJECTS),
    ERROR_FORMAT_NOT_SUPPORTED(VK10.VK_ERROR_FORMAT_NOT_SUPPORTED),
    ERROR_FRAGMENTED_POOL(VK10.VK_ERROR_FRAGMENTED_POOL),
    ERROR_SURFACE_LOST(KHRSurface.VK_ERROR_SURFACE_LOST_KHR),
    ERROR_NATIVE_WINDOW_IN_USE(KHRSurface.VK_ERROR_NATIVE_WINDOW_IN_USE_KHR),
    ERROR_OUT_OF_DATE(KHRSwapchain.VK_ERROR_OUT_OF_DATE_KHR),
    ERROR_INCOMPATIBLE_DISPLAY(KHRDisplaySwapchain.VK_ERROR_INCOMPATIBLE_DISPLAY_KHR);

    private final int value;

    VkResult(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
