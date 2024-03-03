package com.fancode.assignment.controller;

import com.fancode.assignment.entity.News;
import com.fancode.assignment.model.NewsDTO;
import com.fancode.assignment.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @PostMapping("/news")
    public void createNews(@RequestBody NewsDTO newsDto){
        newsService.createNews(newsDto);
    }

    @GetMapping("/news/{matchId}")
    public List<News> getNewsByMatchId(@PathVariable String matchId) {
        return newsService.getNewsByMatchId(matchId);
    }

    @GetMapping("/news/{tourId}")
    public List<News> getNewsByTourId(@PathVariable String tourId) {
        return newsService.getNewsByTourId(tourId);
    }

    @GetMapping("/news/{sportId}")
    public List<News> getNewsBySportId(@PathVariable String sportId) {
        return newsService.getNewsBySportId(sportId);
    }
}
