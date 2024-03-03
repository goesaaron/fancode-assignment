package com.fancode.assignment.model;

import lombok.Data;

@Data
public class NewsDTO {

    private String id;
    private String title;
    private String description;

    private String matchId;
    private String tourId;

}
