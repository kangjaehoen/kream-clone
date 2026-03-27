package com.clone.kream.dto;

import java.util.List;

public record MainPageDataDto(
    List<WishKeywordDto> wishKeywords,
    List<WishItemDto> wishItems,
    List<HotTrendItemDto> hotTrendItems,
    List<LatestTrendItemDto> latestTrendItems,
    List<MainCategoryCardDto> mainCategoryCards,
    List<SpotlightItemDto> spotlightItems,
    List<SlideBannerDto> slideBanners,
    List<MenuDto> menus,
    CardBannerItemDto cardBannerItem,
    List<MostPopularItemDto> mostPopularItems,
    List<SeasonCodiItemDto> seasonCodiItems,
    List<DailySeasonStyleItemDto> dailySeasonStyleItems,
    List<PopularBrandTabDto> popularBrandTabs,
    CoperationBannerDto coperationBanner
) {}
