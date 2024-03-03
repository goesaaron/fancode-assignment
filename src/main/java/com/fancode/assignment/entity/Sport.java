package com.fancode.assignment.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Sport {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private String id;
    private String name;
    private boolean status;
    private LocalDateTime recUpdatedAt;
    private LocalDateTime createdAt;
    @OneToMany(mappedBy = "sport", cascade = CascadeType.ALL)
    private List<Tour> tours = new ArrayList<>();
}
