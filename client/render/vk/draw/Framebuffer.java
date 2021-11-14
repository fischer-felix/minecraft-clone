package client.render.vk.draw;

import client.render.vk.Global;
import client.render.vk.pipeline.Renderpass;
import client.render.vk.present.ImageView;
import client.render.vk.present.Swapchain;
import client.render.vk.setup.Device;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VK10;
import org.lwjgl.vulkan.VkFramebufferCreateInfo;

import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;

public class Framebuffer {
    private final long handle;

    public Framebuffer(Device device, Renderpass renderpass, Swapchain swapchain, ImageView imageView) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            VkFramebufferCreateInfo createInfo = VkFramebufferCreateInfo.malloc(stack)
                    .sType$Default()
                    .flags(0)
                    .pNext(0)
                    .renderPass(renderpass.getHandle())
                    .attachmentCount(1)
                    .pAttachments(stack.longs(imageView.getHandle()))
                    .width(swapchain.getExtent().width())
                    .height(swapchain.getExtent().height())
                    .layers(1);

            LongBuffer pFramebuffer = stack.mallocLong(1);
            Global.vkCheck(VK10.vkCreateFramebuffer(device.getHandle(), createInfo, null, pFramebuffer), "Failed to create framebuffer");
            handle = pFramebuffer.get(0);
        }
    }

    public static List<Framebuffer> createFramebuffers(Device device, Renderpass renderpass, Swapchain swapchain, List<ImageView> imageViews) {
        List<Framebuffer> framebuffers = new ArrayList<>(imageViews.size());
        for (ImageView imageView : imageViews) {
            Framebuffer framebuffer = new Framebuffer(device, renderpass, swapchain, imageView);
            framebuffers.add(framebuffer);
        }
        return framebuffers;
    }

    public void destroy(Device device) {
        VK10.vkDestroyFramebuffer(device.getHandle(), handle, null);
    }

    public long getHandle() {
        return handle;
    }
}