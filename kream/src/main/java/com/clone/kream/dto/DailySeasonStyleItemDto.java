package com.clone.kream.dto;

public record DailySeasonStyleItemDto(
    String dailySeasonStyleItemName,
    Long dailySeasonStyleItemPrice,
    Long dailySeasonStyleItemDiscountPercent,
    String dailySeasonStyleItemImage,
    String dailySeasonStyleItemSubImage,
    String dailySeasonStyleItemUrl
) {}

