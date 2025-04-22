package com.devbrito.sfmoviesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SfmoviesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfmoviesApiApplication.class, args);
	}

}
