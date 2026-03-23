package com.clone.kream.dto;

public record WishItemDto(
    String wishItemImage,
    String wishItemName,
    String wishItemUrl,
    Long wishItemPrice,
    Long wishDiscountPercent
) {}
