package com.devbrito.sfmoviesapi.client;

import com.devbrito.sfmoviesapi.model.MovieLocation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Slf4j
@Component
public class MovieLocationClient {

    private final WebClient webClient;

    public MovieLocationClient(WebClient.Builder webClientBuilder, @Value("${movie.api.url}") String apiBaseUrl) {
        this.webClient = webClientBuilder
                .baseUrl(apiBaseUrl)
                .build();
    }

    @Cacheable("allMovies")
    public List<MovieLocation> getAllMovies() {
        log.info("Retrieving all movies from API");
        return webClient.get()
                .retrieve()
                .bodyToFlux(MovieLocation.class)
                .collectList()
                .block();
    }
}
