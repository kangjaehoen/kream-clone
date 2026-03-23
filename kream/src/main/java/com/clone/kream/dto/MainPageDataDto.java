package com.clone.kream.dto;

import java.util.List;

public record MainPageDataDto(
    List<WishKeywordDto> wishKeywords,
    List<WishItemDto> wishItems,
    List<HotTrendItemDto> hotTrendItems,
    CardBannerItemDto cardBannerItem,
    List<MostPopularItemDto> mostPopularItems
) {}
