package com.clone.kream.dto;

public record MostPopularItemDto(
    String mostPopularItemName,
    Long mostPopularItemPrice,
    Long mostPopularItemDiscountPercent,
    Long mostPopularItemInterest,
    Long mostPopularItemReview,
    String mostPopularItemImage,
    String mostPopularItemUrl
) {}
