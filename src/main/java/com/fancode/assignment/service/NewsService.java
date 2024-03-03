package com.fancode.assignment.service;

import com.fancode.assignment.entity.News;
import com.fancode.assignment.model.NewsDTO;

import java.util.List;

public interface NewsService {

    void createNews(NewsDTO newsDto);

    List<News> getNewsByMatchId(String matchId);

    List<News> getNewsByTourId(String tourId);

    List<News> getNewsBySportId(String sportId);
}