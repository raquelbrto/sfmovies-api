package com.devbrito.sfmoviesapi.service;


import com.devbrito.sfmoviesapi.client.MovieLocationClient;
import com.devbrito.sfmoviesapi.model.MovieLocation;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class MovieLocationService {

    @Autowired
    private MovieLocationClient movieLocationClient;

    public List<MovieLocation> getAllMovieLocations() {
        return movieLocationClient.getAllMovies();
    }

    public List<MovieLocation> filterByTitle(String title) {
        return movieLocationClient.getAllMovies().stream()
                .filter(m -> m.getTitle() != null && m.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }
}
