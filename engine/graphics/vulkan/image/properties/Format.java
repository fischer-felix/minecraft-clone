package engine.graphics.vulkan.image.properties;

import engine.helper.enums.HasValue;
import org.lwjgl.vulkan.VK10;
import org.lwjgl.vulkan.VK11;

public enum Format implements HasValue<Integer> {
    UNDEFINED(VK10.VK_FORMAT_UNDEFINED),
    R4G4_UNORM_PACK8(VK10.VK_FORMAT_R4G4_UNORM_PACK8),
    R4G4B4A4_UNORM_PACK16(VK10.VK_FORMAT_R4G4B4A4_UNORM_PACK16),
    B4G4R4A4_UNORM_PACK16(VK10.VK_FORMAT_B4G4R4A4_UNORM_PACK16),
    R5G6B5_UNORM_PACK16(VK10.VK_FORMAT_R5G6B5_UNORM_PACK16),
    B5G6R5_UNORM_PACK16(VK10.VK_FORMAT_B5G6R5_UNORM_PACK16),
    R5G5B5A1_UNORM_PACK16(VK10.VK_FORMAT_R5G5B5A1_UNORM_PACK16),
    B5G5R5A1_UNORM_PACK16(VK10.VK_FORMAT_B5G5R5A1_UNORM_PACK16),
    A1R5G5B5_UNORM_PACK16(VK10.VK_FORMAT_A1R5G5B5_UNORM_PACK16),
    R8_UNORM(VK10.VK_FORMAT_R8_UNORM),
    R8_SNORM(VK10.VK_FORMAT_R8_SNORM),
    R8_USCALED(VK10.VK_FORMAT_R8_USCALED),
    R8_SSCALED(VK10.VK_FORMAT_R8_SSCALED),
    R8_UINT(VK10.VK_FORMAT_R8_UINT),
    R8_SINT(VK10.VK_FORMAT_R8_SINT),
    R8_SRGB(VK10.VK_FORMAT_R8_SRGB),
    R8G8_UNORM(VK10.VK_FORMAT_R8G8_UNORM),
    R8G8_SNORM(VK10.VK_FORMAT_R8G8_SNORM),
    R8G8_USCALED(VK10.VK_FORMAT_R8G8_USCALED),
    R8G8_SSCALED(VK10.VK_FORMAT_R8G8_SSCALED),
    R8G8_UINT(VK10.VK_FORMAT_R8G8_UINT),
    R8G8_SINT(VK10.VK_FORMAT_R8G8_SINT),
    R8G8_SRGB(VK10.VK_FORMAT_R8G8_SRGB),
    R8G8B8_UNORM(VK10.VK_FORMAT_R8G8B8_UNORM),
    R8G8B8_SNORM(VK10.VK_FORMAT_R8G8B8_SNORM),
    R8G8B8_USCALED(VK10.VK_FORMAT_R8G8B8_USCALED),
    R8G8B8_SSCALED(VK10.VK_FORMAT_R8G8B8_SSCALED),
    R8G8B8_UINT(VK10.VK_FORMAT_R8G8B8_UINT),
    R8G8B8_SINT(VK10.VK_FORMAT_R8G8B8_SINT),
    R8G8B8_SRGB(VK10.VK_FORMAT_R8G8B8_SRGB),
    B8G8R8_UNORM(VK10.VK_FORMAT_B8G8R8_UNORM),
    B8G8R8_SNORM(VK10.VK_FORMAT_B8G8R8_SNORM),
    B8G8R8_USCALED(VK10.VK_FORMAT_B8G8R8_USCALED),
    B8G8R8_SSCALED(VK10.VK_FORMAT_B8G8R8_SSCALED),
    B8G8R8_UINT(VK10.VK_FORMAT_B8G8R8_UINT),
    B8G8R8_SINT(VK10.VK_FORMAT_B8G8R8_SINT),
    B8G8R8_SRGB(VK10.VK_FORMAT_B8G8R8_SRGB),
    R8G8B8A8_UNORM(VK10.VK_FORMAT_R8G8B8A8_UNORM),
    R8G8B8A8_SNORM(VK10.VK_FORMAT_R8G8B8A8_SNORM),
    R8G8B8A8_USCALED(VK10.VK_FORMAT_R8G8B8A8_USCALED),
    R8G8B8A8_SSCALED(VK10.VK_FORMAT_R8G8B8A8_SSCALED),
    R8G8B8A8_UINT(VK10.VK_FORMAT_R8G8B8A8_UINT),
    R8G8B8A8_SINT(VK10.VK_FORMAT_R8G8B8A8_SINT),
    R8G8B8A8_SRGB(VK10.VK_FORMAT_R8G8B8A8_SRGB),
    B8G8R8A8_UNORM(VK10.VK_FORMAT_B8G8R8A8_UNORM),
    B8G8R8A8_SNORM(VK10.VK_FORMAT_B8G8R8A8_SNORM),
    B8G8R8A8_USCALED(VK10.VK_FORMAT_B8G8R8A8_USCALED),
    B8G8R8A8_SSCALED(VK10.VK_FORMAT_B8G8R8A8_SSCALED),
    B8G8R8A8_UINT(VK10.VK_FORMAT_B8G8R8A8_UINT),
    B8G8R8A8_SINT(VK10.VK_FORMAT_B8G8R8A8_SINT),
    B8G8R8A8_SRGB(VK10.VK_FORMAT_B8G8R8A8_SRGB),
    A8B8G8R8_UNORM_PACK32(VK10.VK_FORMAT_A8B8G8R8_UNORM_PACK32),
    A8B8G8R8_SNORM_PACK32(VK10.VK_FORMAT_A8B8G8R8_SNORM_PACK32),
    A8B8G8R8_USCALED_PACK32(VK10.VK_FORMAT_A8B8G8R8_USCALED_PACK32),
    A8B8G8R8_SSCALED_PACK32(VK10.VK_FORMAT_A8B8G8R8_SSCALED_PACK32),
    A8B8G8R8_UINT_PACK32(VK10.VK_FORMAT_A8B8G8R8_UINT_PACK32),
    A8B8G8R8_SINT_PACK32(VK10.VK_FORMAT_A8B8G8R8_SINT_PACK32),
    A8B8G8R8_SRGB_PACK32(VK10.VK_FORMAT_A8B8G8R8_SRGB_PACK32),
    A2R10G10B10_UNORM_PACK32(VK10.VK_FORMAT_A2R10G10B10_UNORM_PACK32),
    A2R10G10B10_SNORM_PACK32(VK10.VK_FORMAT_A2R10G10B10_SNORM_PACK32),
    A2R10G10B10_USCALED_PACK32(VK10.VK_FORMAT_A2R10G10B10_USCALED_PACK32),
    A2R10G10B10_SSCALED_PACK32(VK10.VK_FORMAT_A2R10G10B10_SSCALED_PACK32),
    A2R10G10B10_UINT_PACK32(VK10.VK_FORMAT_A2R10G10B10_UINT_PACK32),
    A2R10G10B10_SINT_PACK32(VK10.VK_FORMAT_A2R10G10B10_SINT_PACK32),
    A2B10G10R10_UNORM_PACK32(VK10.VK_FORMAT_A2B10G10R10_UNORM_PACK32),
    A2B10G10R10_SNORM_PACK32(VK10.VK_FORMAT_A2B10G10R10_SNORM_PACK32),
    A2B10G10R10_USCALED_PACK32(VK10.VK_FORMAT_A2B10G10R10_USCALED_PACK32),
    A2B10G10R10_SSCALED_PACK32(VK10.VK_FORMAT_A2B10G10R10_SSCALED_PACK32),
    A2B10G10R10_UINT_PACK32(VK10.VK_FORMAT_A2B10G10R10_UINT_PACK32),
    A2B10G10R10_SINT_PACK32(VK10.VK_FORMAT_A2B10G10R10_SINT_PACK32),
    R16_UNORM(VK10.VK_FORMAT_R16_UNORM),
    R16_SNORM(VK10.VK_FORMAT_R16_SNORM),
    R16_USCALED(VK10.VK_FORMAT_R16_USCALED),
    R16_SSCALED(VK10.VK_FORMAT_R16_SSCALED),
    R16_UINT(VK10.VK_FORMAT_R16_UINT),
    R16_SINT(VK10.VK_FORMAT_R16_SINT),
    R16_SFLOAT(VK10.VK_FORMAT_R16_SFLOAT),
    R16G16_UNORM(VK10.VK_FORMAT_R16G16_UNORM),
    R16G16_SNORM(VK10.VK_FORMAT_R16G16_SNORM),
    R16G16_USCALED(VK10.VK_FORMAT_R16G16_USCALED),
    R16G16_SSCALED(VK10.VK_FORMAT_R16G16_SSCALED),
    R16G16_UINT(VK10.VK_FORMAT_R16G16_UINT),
    R16G16_SINT(VK10.VK_FORMAT_R16G16_SINT),
    R16G16_SFLOAT(VK10.VK_FORMAT_R16G16_SFLOAT),
    R16G16B16_UNORM(VK10.VK_FORMAT_R16G16B16_UNORM),
    R16G16B16_SNORM(VK10.VK_FORMAT_R16G16B16_SNORM),
    R16G16B16_USCALED(VK10.VK_FORMAT_R16G16B16_USCALED),
    R16G16B16_SSCALED(VK10.VK_FORMAT_R16G16B16_SSCALED),
    R16G16B16_UINT(VK10.VK_FORMAT_R16G16B16_UINT),
    R16G16B16_SINT(VK10.VK_FORMAT_R16G16B16_SINT),
    R16G16B16_SFLOAT(VK10.VK_FORMAT_R16G16B16_SFLOAT),
    R16G16B16A16_UNORM(VK10.VK_FORMAT_R16G16B16A16_UNORM),
    R16G16B16A16_SNORM(VK10.VK_FORMAT_R16G16B16A16_SNORM),
    R16G16B16A16_USCALED(VK10.VK_FORMAT_R16G16B16A16_USCALED),
    R16G16B16A16_SSCALED(VK10.VK_FORMAT_R16G16B16A16_SSCALED),
    R16G16B16A16_UINT(VK10.VK_FORMAT_R16G16B16A16_UINT),
    R16G16B16A16_SINT(VK10.VK_FORMAT_R16G16B16A16_SINT),
    R16G16B16A16_SFLOAT(VK10.VK_FORMAT_R16G16B16A16_SFLOAT),
    R32_UINT(VK10.VK_FORMAT_R32_UINT),
    R32_SINT(VK10.VK_FORMAT_R32_SINT),
    R32_SFLOAT(VK10.VK_FORMAT_R32_SFLOAT),
    R32G32_UINT(VK10.VK_FORMAT_R32G32_UINT),
    R32G32_SINT(VK10.VK_FORMAT_R32G32_SINT),
    R32G32_SFLOAT(VK10.VK_FORMAT_R32G32_SFLOAT),
    R32G32B32_UINT(VK10.VK_FORMAT_R32G32B32_UINT),
    R32G32B32_SINT(VK10.VK_FORMAT_R32G32B32_SINT),
    R32G32B32_SFLOAT(VK10.VK_FORMAT_R32G32B32_SFLOAT),
    R32G32B32A32_UINT(VK10.VK_FORMAT_R32G32B32A32_UINT),
    R32G32B32A32_SINT(VK10.VK_FORMAT_R32G32B32A32_SINT),
    R32G32B32A32_SFLOAT(VK10.VK_FORMAT_R32G32B32A32_SFLOAT),
    R64_UINT(VK10.VK_FORMAT_R64_UINT),
    R64_SINT(VK10.VK_FORMAT_R64_SINT),
    R64_SFLOAT(VK10.VK_FORMAT_R64_SFLOAT),
    R64G64_UINT(VK10.VK_FORMAT_R64G64_UINT),
    R64G64_SINT(VK10.VK_FORMAT_R64G64_SINT),
    R64G64_SFLOAT(VK10.VK_FORMAT_R64G64_SFLOAT),
    R64G64B64_UINT(VK10.VK_FORMAT_R64G64B64_UINT),
    R64G64B64_SINT(VK10.VK_FORMAT_R64G64B64_SINT),
    R64G64B64_SFLOAT(VK10.VK_FORMAT_R64G64B64_SFLOAT),
    R64G64B64A64_UINT(VK10.VK_FORMAT_R64G64B64A64_UINT),
    R64G64B64A64_SINT(VK10.VK_FORMAT_R64G64B64A64_SINT),
    R64G64B64A64_SFLOAT(VK10.VK_FORMAT_R64G64B64A64_SFLOAT),
    B10G11R11_UFLOAT_PACK32(VK10.VK_FORMAT_B10G11R11_UFLOAT_PACK32),
    E5B9G9R9_UFLOAT_PACK32(VK10.VK_FORMAT_E5B9G9R9_UFLOAT_PACK32),
    D16_UNORM(VK10.VK_FORMAT_D16_UNORM),
    X8_D24_UNORM_PACK32(VK10.VK_FORMAT_X8_D24_UNORM_PACK32),
    D32_SFLOAT(VK10.VK_FORMAT_D32_SFLOAT),
    S8_UINT(VK10.VK_FORMAT_S8_UINT),
    D16_UNORM_S8_UINT(VK10.VK_FORMAT_D16_UNORM_S8_UINT),
    D24_UNORM_S8_UINT(VK10.VK_FORMAT_D24_UNORM_S8_UINT),
    D32_SFLOAT_S8_UINT(VK10.VK_FORMAT_D32_SFLOAT_S8_UINT),
    BC1_RGB_UNORM_BLOCK(VK10.VK_FORMAT_BC1_RGB_UNORM_BLOCK),
    BC1_RGB_SRGB_BLOCK(VK10.VK_FORMAT_BC1_RGB_SRGB_BLOCK),
    BC1_RGBA_UNORM_BLOCK(VK10.VK_FORMAT_BC1_RGBA_UNORM_BLOCK),
    BC1_RGBA_SRGB_BLOCK(VK10.VK_FORMAT_BC1_RGBA_SRGB_BLOCK),
    BC2_UNORM_BLOCK(VK10.VK_FORMAT_BC2_UNORM_BLOCK),
    BC2_SRGB_BLOCK(VK10.VK_FORMAT_BC2_SRGB_BLOCK),
    BC3_UNORM_BLOCK(VK10.VK_FORMAT_BC3_UNORM_BLOCK),
    BC3_SRGB_BLOCK(VK10.VK_FORMAT_BC3_SRGB_BLOCK),
    BC4_UNORM_BLOCK(VK10.VK_FORMAT_BC4_UNORM_BLOCK),
    BC4_SNORM_BLOCK(VK10.VK_FORMAT_BC4_SNORM_BLOCK),
    BC5_UNORM_BLOCK(VK10.VK_FORMAT_BC5_UNORM_BLOCK),
    BC5_SNORM_BLOCK(VK10.VK_FORMAT_BC5_SNORM_BLOCK),
    BC6H_UFLOAT_BLOCK(VK10.VK_FORMAT_BC6H_UFLOAT_BLOCK),
    BC6H_SFLOAT_BLOCK(VK10.VK_FORMAT_BC6H_SFLOAT_BLOCK),
    BC7_UNORM_BLOCK(VK10.VK_FORMAT_BC7_UNORM_BLOCK),
    BC7_SRGB_BLOCK(VK10.VK_FORMAT_BC7_SRGB_BLOCK),
    ETC2_R8G8B8_UNORM_BLOCK(VK10.VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK),
    ETC2_R8G8B8_SRGB_BLOCK(VK10.VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK),
    ETC2_R8G8B8A1_UNORM_BLOCK(VK10.VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK),
    ETC2_R8G8B8A1_SRGB_BLOCK(VK10.VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK),
    ETC2_R8G8B8A8_UNORM_BLOCK(VK10.VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK),
    ETC2_R8G8B8A8_SRGB_BLOCK(VK10.VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK),
    EAC_R11_UNORM_BLOCK(VK10.VK_FORMAT_EAC_R11_UNORM_BLOCK),
    EAC_R11_SNORM_BLOCK(VK10.VK_FORMAT_EAC_R11_SNORM_BLOCK),
    EAC_R11G11_UNORM_BLOCK(VK10.VK_FORMAT_EAC_R11G11_UNORM_BLOCK),
    EAC_R11G11_SNORM_BLOCK(VK10.VK_FORMAT_EAC_R11G11_SNORM_BLOCK),
    ASTC_4X4_UNORM_BLOCK(VK10.VK_FORMAT_ASTC_4x4_UNORM_BLOCK),
    ASTC_4X4_SRGB_BLOCK(VK10.VK_FORMAT_ASTC_4x4_SRGB_BLOCK),
    ASTC_5X4_UNORM_BLOCK(VK10.VK_FORMAT_ASTC_5x4_UNORM_BLOCK),
    ASTC_5X4_SRGB_BLOCK(VK10.VK_FORMAT_ASTC_5x4_SRGB_BLOCK),
    ASTC_5X5_UNORM_BLOCK(VK10.VK_FORMAT_ASTC_5x5_UNORM_BLOCK),
    ASTC_5X5_SRGB_BLOCK(VK10.VK_FORMAT_ASTC_5x5_SRGB_BLOCK),
    ASTC_6X5_UNORM_BLOCK(VK10.VK_FORMAT_ASTC_6x5_UNORM_BLOCK),
    ASTC_6X5_SRGB_BLOCK(VK10.VK_FORMAT_ASTC_6x5_SRGB_BLOCK),
    ASTC_6X6_UNORM_BLOCK(VK10.VK_FORMAT_ASTC_6x6_UNORM_BLOCK),
    ASTC_6X6_SRGB_BLOCK(VK10.VK_FORMAT_ASTC_6x6_SRGB_BLOCK),
    ASTC_8X5_UNORM_BLOCK(VK10.VK_FORMAT_ASTC_8x5_UNORM_BLOCK),
    ASTC_8X5_SRGB_BLOCK(VK10.VK_FORMAT_ASTC_8x5_SRGB_BLOCK),
    ASTC_8X6_UNORM_BLOCK(VK10.VK_FORMAT_ASTC_8x6_UNORM_BLOCK),
    ASTC_8X6_SRGB_BLOCK(VK10.VK_FORMAT_ASTC_8x6_SRGB_BLOCK),
    ASTC_8X8_UNORM_BLOCK(VK10.VK_FORMAT_ASTC_8x8_UNORM_BLOCK),
    ASTC_8X8_SRGB_BLOCK(VK10.VK_FORMAT_ASTC_8x8_SRGB_BLOCK),
    ASTC_10X5_UNORM_BLOCK(VK10.VK_FORMAT_ASTC_10x5_UNORM_BLOCK),
    ASTC_10X5_SRGB_BLOCK(VK10.VK_FORMAT_ASTC_10x5_SRGB_BLOCK),
    ASTC_10X6_UNORM_BLOCK(VK10.VK_FORMAT_ASTC_10x6_UNORM_BLOCK),
    ASTC_10X6_SRGB_BLOCK(VK10.VK_FORMAT_ASTC_10x6_SRGB_BLOCK),
    ASTC_10X8_UNORM_BLOCK(VK10.VK_FORMAT_ASTC_10x8_UNORM_BLOCK),
    ASTC_10X8_SRGB_BLOCK(VK10.VK_FORMAT_ASTC_10x8_SRGB_BLOCK),
    ASTC_10X10_UNORM_BLOCK(VK10.VK_FORMAT_ASTC_10x10_UNORM_BLOCK),
    ASTC_10X10_SRGB_BLOCK(VK10.VK_FORMAT_ASTC_10x10_SRGB_BLOCK),
    ASTC_12X10_UNORM_BLOCK(VK10.VK_FORMAT_ASTC_12x10_UNORM_BLOCK),
    ASTC_12X10_SRGB_BLOCK(VK10.VK_FORMAT_ASTC_12x10_SRGB_BLOCK),
    ASTC_12X12_UNORM_BLOCK(VK10.VK_FORMAT_ASTC_12x12_UNORM_BLOCK),
    ASTC_12X12_SRGB_BLOCK(VK10.VK_FORMAT_ASTC_12x12_SRGB_BLOCK),
    G8B8G8R8_422_UNORM(VK11.VK_FORMAT_G8B8G8R8_422_UNORM),
    B8G8R8G8_422_UNORM(VK11.VK_FORMAT_B8G8R8G8_422_UNORM),
    G8_B8_R8_3PLANE_420_UNORM(VK11.VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM),
    G8_B8R8_2PLANE_420_UNORM(VK11.VK_FORMAT_G8_B8R8_2PLANE_420_UNORM),
    G8_B8_R8_3PLANE_422_UNORM(VK11.VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM),
    G8_B8R8_2PLANE_422_UNORM(VK11.VK_FORMAT_G8_B8R8_2PLANE_422_UNORM),
    G8_B8_R8_3PLANE_444_UNORM(VK11.VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM),
    R10X6_UNORM_PACK16(VK11.VK_FORMAT_R10X6_UNORM_PACK16),
    R10X6G10X6_UNORM_2PACK16(VK11.VK_FORMAT_R10X6G10X6_UNORM_2PACK16),
    R10X6G10X6B10X6A10X6_UNORM_4PACK16(VK11.VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16),
    G10X6B10X6G10X6R10X6_422_UNORM_4PACK16(VK11.VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16),
    B10X6G10X6R10X6G10X6_422_UNORM_4PACK16(VK11.VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16),
    G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16(VK11.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16),
    G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16(VK11.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16),
    G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16(VK11.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16),
    G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16(VK11.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16),
    G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16(VK11.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16),
    R12X4_UNORM_PACK16(VK11.VK_FORMAT_R12X4_UNORM_PACK16),
    R12X4G12X4_UNORM_2PACK16(VK11.VK_FORMAT_R12X4G12X4_UNORM_2PACK16),
    R12X4G12X4B12X4A12X4_UNORM_4PACK16(VK11.VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16),
    G12X4B12X4G12X4R12X4_422_UNORM_4PACK16(VK11.VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16),
    B12X4G12X4R12X4G12X4_422_UNORM_4PACK16(VK11.VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16),
    G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16(VK11.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16),
    G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16(VK11.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16),
    G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16(VK11.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16),
    G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16(VK11.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16),
    G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16(VK11.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16),
    G16B16G16R16_422_UNORM(VK11.VK_FORMAT_G16B16G16R16_422_UNORM),
    B16G16R16G16_422_UNORM(VK11.VK_FORMAT_B16G16R16G16_422_UNORM),
    G16_B16_R16_3PLANE_420_UNORM(VK11.VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM),
    G16_B16R16_2PLANE_420_UNORM(VK11.VK_FORMAT_G16_B16R16_2PLANE_420_UNORM),
    G16_B16_R16_3PLANE_422_UNORM(VK11.VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM),
    G16_B16R16_2PLANE_422_UNORM(VK11.VK_FORMAT_G16_B16R16_2PLANE_422_UNORM),
    G16_B16_R16_3PLANE_444_UNORM(VK11.VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM);

    private final int value;

    Format(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}