package com.fancode.assignment.repository;

import com.fancode.assignment.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<Tour, String> {
}
