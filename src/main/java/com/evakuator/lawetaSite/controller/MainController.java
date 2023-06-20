package com.evakuator.lawetaSite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("title", "Эвакуатор Варшава");
        return "index";
    }

    @GetMapping("/about_us")
    public String about_us(Model model) {
        model.addAttribute("title", "О нас");
        return "about_us";
    }

    @GetMapping("/reviews")
    public String reviews(Model model) {
        model.addAttribute("title", "Отзывы наших клиентов");
        return "reviews";
    }

    @GetMapping("/price")
    public String price(Model model) {
        model.addAttribute("title", "Цены на услуги");
        return "price";
    }

    @GetMapping("/payment")
    public String payment(Model model) {
        model.addAttribute("title", "Способы оплаты");
        return "payment";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Связаться с нами");
        return "contact";
    }

}