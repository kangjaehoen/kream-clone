package com.clone.kream.service;

import com.clone.kream.dto.CardBannerItemDto;
import com.clone.kream.dto.HotTrendItemDto;
import com.clone.kream.dto.MainPageDataDto;
import com.clone.kream.dto.MostPopularItemDto;
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

        CardBannerItemDto cardBannerItem = mainPageMapper.toCardBannerItemDto(mainPageRepository.findCardBannerItem());

        List<MostPopularItemDto> mostPopularItems = mainPageRepository.findMostPopularItems()
            .stream()
            .map(mainPageMapper::toMostPopularItemDto)
            .toList();

        return new MainPageDataDto(
            wishKeywords,
            wishItems,
            hotTrendItems,
            cardBannerItem,
            mostPopularItems
        );
    }
}
