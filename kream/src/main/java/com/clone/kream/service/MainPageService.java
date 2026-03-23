package com.clone.kream.service;

import com.clone.kream.dto.MainPageDataDto;
import com.clone.kream.repository.MainPageRepository;
import org.springframework.stereotype.Service;

@Service
public class MainPageService {

    private final MainPageRepository mainPageRepository;

    public MainPageService(MainPageRepository mainPageRepository) {
        this.mainPageRepository = mainPageRepository;
    }

    public MainPageDataDto getMainPageData() {
        return new MainPageDataDto(
            mainPageRepository.findWishKeywords(),
            mainPageRepository.findWishItems(),
            mainPageRepository.findHotTrendItems(),
            mainPageRepository.findCardBannerItem(),
            mainPageRepository.findMostPopularItems()
        );
    }
}
