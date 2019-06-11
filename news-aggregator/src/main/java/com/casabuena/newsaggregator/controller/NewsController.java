package com.casabuena.newsaggregator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.casabuena.newsaggregator.service.NewsService;

@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping
    public String getAllCountries(Model model) {
        model.addAttribute("newslist", newsService.getNews());

        return "news/list";
    }
}
