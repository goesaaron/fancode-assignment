package com.fancode.assignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Match {

    @Id
    private String id;
    private String name;
    private boolean status;
    private String format;
    private LocalDateTime recUpdatedAt;
    private LocalDateTime createdAt;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
    @JoinColumn(name = "tour_id", nullable = false)
    private Tour tour;

}
