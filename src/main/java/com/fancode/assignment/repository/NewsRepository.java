package com.fancode.assignment.repository;

import com.fancode.assignment.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, String> {

    List<News> findByMatchId(String matchId);
    List<News> findByTourId(String tourId);
    List<News> findBySportId(String sportId);
}
