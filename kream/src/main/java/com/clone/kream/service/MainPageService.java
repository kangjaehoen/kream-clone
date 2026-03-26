package com.clone.kream.service;

import com.clone.kream.dto.CardBannerItemDto;
import com.clone.kream.dto.HotTrendItemDto;
import com.clone.kream.dto.LatestTrendItemDto;
import com.clone.kream.dto.MenuDto;
import com.clone.kream.dto.MainPageDataDto;
import com.clone.kream.dto.MainCategoryCardDto;
import com.clone.kream.dto.MostPopularItemDto;
import com.clone.kream.dto.SpotlightItemDto;
import com.clone.kream.dto.SlideBannerDto;
import com.clone.kream.dto.WishItemDto;
import com.clone.kream.dto.WishKeywordDto;
import com.clone.kream.mapper.MainPageMapper;
import com.clone.kream.repository.MainPageRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MainPageService {

    private final MainPageRepository mainPageRepository;
    private final MainPageMapper mainPageMapper;

    public MainPageService(MainPageRepository mainPageRepository, MainPageMapper mainPageMapper) {
        this.mainPageRepository = mainPageRepository;
        this.mainPageMapper = mainPageMapper;
    }

    public MainPageDataDto getMainPageData() {
        List<WishKeywordDto> wishKeywords = mainPageRepository.findWishKeywords()
            .stream()
            .map(mainPageMapper::toWishKeywordDto)
            .toList();

        List<WishItemDto> wishItems = mainPageRepository.findWishItems()
            .stream()
            .map(mainPageMapper::toWishItemDto)
            .toList();

        List<HotTrendItemDto> hotTrendItems = mainPageRepository.findHotTrendItems()
            .stream()
            .map(mainPageMapper::toHotTrendItemDto)
            .toList();

        List<LatestTrendItemDto> latestTrendItems = mainPageRepository.findLatestTrendItems()
            .stream()
            .map(mainPageMapper::toLatestTrendItemDto)
            .toList();

        List<MainCategoryCardDto> mainCategoryCards = mainPageRepository.findMainCategoryCards()
            .stream()
            .map(mainPageMapper::toMainCategoryCardDto)
            .toList();

        List<SpotlightItemDto> spotlightItems = mainPageRepository.findSpotlightItems()
            .stream()
            .map(mainPageMapper::toSpotlightItemDto)
            .toList();

        List<SlideBannerDto> slideBanners = mainPageRepository.findSlideBanners()
            .stream()
            .map(mainPageMapper::toSlideBannerDto)
            .toList();

        List<MenuDto> menus = mainPageRepository.findMenus()
            .stream()
            .map(mainPageMapper::toMenuDto)
            .toList();

        CardBannerItemDto cardBannerItem = mainPageMapper.toCardBannerItemDto(mainPageRepository.findCardBannerItem());

        List<MostPopularItemDto> mostPopularItems = mainPageRepository.findMostPopularItems()
            .stream()
            .map(mainPageMapper::toMostPopularItemDto)
            .toList();

        return new MainPageDataDto(
            wishKeywords,
            wishItems,
            hotTrendItems,
            latestTrendItems,
            mainCategoryCards,
            spotlightItems,
            slideBanners,
            menus,
            cardBannerItem,
            mostPopularItems
        );
    }
}
