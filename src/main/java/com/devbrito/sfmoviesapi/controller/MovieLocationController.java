package com.devbrito.sfmoviesapi.controller;

import com.devbrito.sfmoviesapi.model.MovieLocation;
import com.devbrito.sfmoviesapi.service.MovieLocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieLocationController {

    @Autowired
    private MovieLocationService movieLocationService;

    @GetMapping
    public List<MovieLocation> findAll(@RequestParam Optional<String> title) {
        return title.map(movieLocationService::filterByTitle)
                .orElseGet(movieLocationService::getAllMovieLocations);
    }
}
