package com.clone.kream.service;

import com.clone.kream.repository.MainPageRepository;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class MainPageService {

    private final MainPageRepository mainPageRepository;

    public MainPageService(MainPageRepository mainPageRepository) {
        this.mainPageRepository = mainPageRepository;
    }

    public Map<String, Object> getMainPageData() {
        Map<String, Object> model = new HashMap<>();

        model.put("wishKeywords", mainPageRepository.findWishKeywords());
        model.put("wishItems", mainPageRepository.findWishItems());
        model.put("hotTrendItems", mainPageRepository.findHotTrendItems());
        model.put("cardBannerItem", mainPageRepository.findCardBannerItem());
        model.put("mostPopularItems", mainPageRepository.findMostPopularItems());

        return model;
    }
}
