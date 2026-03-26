package com.clone.kream.controller;

import com.clone.kream.service.AdminWishKeywardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin/wish-keywards")
public class AdminWishKeywardController {

    private final AdminWishKeywardService adminWishKeywardService;

    public AdminWishKeywardController(AdminWishKeywardService adminWishKeywardService) {
        this.adminWishKeywardService = adminWishKeywardService;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("items", adminWishKeywardService.listActive());
        return "admin/wish-keyward-list";
    }

    @PostMapping
    public String create(
        @RequestParam("wishKeywardName") String wishKeywardName,
        RedirectAttributes redirectAttributes
    ) {
        adminWishKeywardService.create(wishKeywardName);
        redirectAttributes.addFlashAttribute("message", "키워드가 추가되었습니다.");
        return "redirect:/admin/wish-keywards";
    }

    @PostMapping("/{id}")
    public String update(
        @PathVariable("id") Long id,
        @RequestParam("wishKeywardName") String wishKeywardName,
        RedirectAttributes redirectAttributes
    ) {
        adminWishKeywardService.update(id, wishKeywardName);
        redirectAttributes.addFlashAttribute("message", "키워드가 수정되었습니다.");
        return "redirect:/admin/wish-keywards";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
        adminWishKeywardService.softDelete(id);
        redirectAttributes.addFlashAttribute("message", "키워드가 삭제되었습니다.");
        return "redirect:/admin/wish-keywards";
    }
}

