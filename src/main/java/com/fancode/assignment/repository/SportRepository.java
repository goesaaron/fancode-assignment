package com.fancode.assignment.repository;

import com.fancode.assignment.entity.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportRepository extends JpaRepository<Sport, String> {
}
