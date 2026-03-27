package com.clone.kream.dto;

public record PopularBrandItemDto(
    String popularBrandItemName,
    Long popularBrandItemPrice,
    Long popularBrandItemDiscountPercent,
    Long popularBrandItemInterest,
    Long popularBrandItemReview,
    String popularBrandItemImage,
    String popularBrandItemUrl
) {}
