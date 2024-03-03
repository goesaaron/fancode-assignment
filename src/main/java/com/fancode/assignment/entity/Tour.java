package com.fancode.assignment.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Tour {

    @Id
    private String id;
    private String name;
    private boolean status;
    private LocalDateTime recUpdatedAt;
    private LocalDateTime createdAt;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
    @JoinColumn(name = "sport_id", nullable = false)
    private Sport sport;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
    private List<Match> matches = new ArrayList<>();


}
