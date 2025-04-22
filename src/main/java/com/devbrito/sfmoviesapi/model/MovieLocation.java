package com.devbrito.sfmoviesapi.model;

import lombok.Data;
import lombok.Getter;

@Data
public class MovieLocation {

    private String title;
    private String release_year;
    private String locations;
    private String actor_1;
    private String actor_2;
    private String actor_3;

}
