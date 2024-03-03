package com.fancode.assignment.repository;

import com.fancode.assignment.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, String> {
}