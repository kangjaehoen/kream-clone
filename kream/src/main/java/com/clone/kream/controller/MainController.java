package com.clone.kream.controller;

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
        model.addAllAttributes(mainPageService.getMainPageData());
        return "main/index";
    }

    
}
