package com.clone.kream.dto;

public record SelectBrandItemDto(
    String selectBrandItemName,
    String selectBrandItemImage,
    String selectBrandItemUrl,
    Long selectBrandItemDiscountPercent
) {}
