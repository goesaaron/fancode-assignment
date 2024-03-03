package com.fancode.assignment.service;

import com.fancode.assignment.entity.News;
import com.fancode.assignment.model.NewsDTO;
import com.fancode.assignment.repository.NewsRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public void createNews(NewsDTO newsDto) {
        News news = new News();
        BeanUtils.copyProperties(newsDto, news);
        newsRepository.save(news);
    }

    @Override
    public List<News> getNewsByMatchId(String matchId) {
        return newsRepository.findByMatchId(matchId);
    }

    @Override
    public List<News> getNewsByTourId(String tourId) {
        return newsRepository.findByTourId(tourId);
    }

    @Override
    public List<News> getNewsBySportId(String sportId) {
        return newsRepository.findBySportId(sportId);
    }
}
