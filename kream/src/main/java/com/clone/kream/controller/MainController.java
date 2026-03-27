package com.clone.kream.controller;

import com.clone.kream.dto.MainPageDataDto;
import com.clone.kream.service.MainPageService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final MainPageService mainPageService;

    public MainController(MainPageService mainPageService) {
        this.mainPageService = mainPageService;
    }

    @GetMapping("/")
    public String index(Model model) {
        MainPageDataDto mainPageData = mainPageService.getMainPageData();
        model.addAttribute("wishKeywords", mainPageData.wishKeywords());
        model.addAttribute("wishItems", mainPageData.wishItems());
        model.addAttribute("hotTrendItems", mainPageData.hotTrendItems());
        model.addAttribute("latestTrendItems", mainPageData.latestTrendItems());
        model.addAttribute("mainCategoryCards", mainPageData.mainCategoryCards());
        model.addAttribute("spotlightItems", mainPageData.spotlightItems());
        model.addAttribute("slideBanners", mainPageData.slideBanners());
        model.addAttribute("menus", mainPageData.menus());
        model.addAttribute("cardBannerItem", mainPageData.cardBannerItem());
        model.addAttribute("mostPopularItems", mainPageData.mostPopularItems());
        model.addAttribute("seasonCodiItems", mainPageData.seasonCodiItems());
        model.addAttribute("dailySeasonStyleItems", mainPageData.dailySeasonStyleItems());
        model.addAttribute("popularBrandTabs", mainPageData.popularBrandTabs());
        model.addAttribute("coperationBanner", mainPageData.coperationBanner());
        return "main/index";
    }

    
}
