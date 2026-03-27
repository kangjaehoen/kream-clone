package com.clone.kream.controller;

import com.clone.kream.service.AdminDailySeasonStyleItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin/daily-season-style-items")
public class AdminDailySeasonStyleItemController {

    private final AdminDailySeasonStyleItemService adminDailySeasonStyleItemService;

    public AdminDailySeasonStyleItemController(AdminDailySeasonStyleItemService adminDailySeasonStyleItemService) {
        this.adminDailySeasonStyleItemService = adminDailySeasonStyleItemService;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("items", adminDailySeasonStyleItemService.listActive());
        return "admin/daily-season-style-item-list";
    }

    @PostMapping
    public String create(
        @RequestParam("dailySeasonStyleItemName") String dailySeasonStyleItemName,
        @RequestParam(value = "dailySeasonStyleItemPrice", required = false) String dailySeasonStyleItemPrice,
        @RequestParam(value = "dailySeasonStyleItemDiscountPercent", required = false) String dailySeasonStyleItemDiscountPercent,
        @RequestParam("dailySeasonStyleItemImage") String dailySeasonStyleItemImage,
        @RequestParam("dailySeasonStyleItemSubImage") String dailySeasonStyleItemSubImage,
        @RequestParam("dailySeasonStyleItemUrl") String dailySeasonStyleItemUrl,
        RedirectAttributes redirectAttributes
    ) {
        try {
            adminDailySeasonStyleItemService.create(
                dailySeasonStyleItemName.trim(),
                parseLongOrNull(dailySeasonStyleItemPrice),
                parseLongOrNull(dailySeasonStyleItemDiscountPercent),
                dailySeasonStyleItemImage.trim(),
                dailySeasonStyleItemSubImage.trim(),
                dailySeasonStyleItemUrl.trim()
            );
        } catch (NumberFormatException e) {
            redirectAttributes.addFlashAttribute("message", "가격·할인율은 정수 숫자만 입력하세요.");
            return "redirect:/admin/daily-season-style-items";
        }
        redirectAttributes.addFlashAttribute("message", "항목이 추가되었습니다.");
        return "redirect:/admin/daily-season-style-items";
    }

    @PostMapping("/{id}")
    public String update(
        @PathVariable("id") Long id,
        @RequestParam("dailySeasonStyleItemName") String dailySeasonStyleItemName,
        @RequestParam(value = "dailySeasonStyleItemPrice", required = false) String dailySeasonStyleItemPrice,
        @RequestParam(value = "dailySeasonStyleItemDiscountPercent", required = false) String dailySeasonStyleItemDiscountPercent,
        @RequestParam("dailySeasonStyleItemImage") String dailySeasonStyleItemImage,
        @RequestParam("dailySeasonStyleItemSubImage") String dailySeasonStyleItemSubImage,
        @RequestParam("dailySeasonStyleItemUrl") String dailySeasonStyleItemUrl,
        RedirectAttributes redirectAttributes
    ) {
        try {
            adminDailySeasonStyleItemService.update(
                id,
                dailySeasonStyleItemName.trim(),
                parseLongOrNull(dailySeasonStyleItemPrice),
                parseLongOrNull(dailySeasonStyleItemDiscountPercent),
                dailySeasonStyleItemImage.trim(),
                dailySeasonStyleItemSubImage.trim(),
                dailySeasonStyleItemUrl.trim()
            );
        } catch (NumberFormatException e) {
            redirectAttributes.addFlashAttribute("message", "가격·할인율은 정수 숫자만 입력하세요.");
            return "redirect:/admin/daily-season-style-items";
        }
        redirectAttributes.addFlashAttribute("message", "항목이 수정되었습니다.");
        return "redirect:/admin/daily-season-style-items";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
        adminDailySeasonStyleItemService.softDelete(id);
        redirectAttributes.addFlashAttribute("message", "항목이 삭제되었습니다.");
        return "redirect:/admin/daily-season-style-items";
    }

    private static Long parseLongOrNull(String raw) {
        if (raw == null) {
            return null;
        }
        String s = raw.trim();
        if (s.isEmpty()) {
            return null;
        }
        return Long.parseLong(s);
    }
}

