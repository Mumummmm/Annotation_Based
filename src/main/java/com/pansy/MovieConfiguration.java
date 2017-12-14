package com.pansy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
public class MovieConfiguration {
    @Bean
    @Primary
    public MovieCatalog firstMovieCatalog() {
        return new MovieCatalog();
    }

    @Bean
    public MovieCatalog secondMovieCatalog() {
        return new MovieCatalog();
    }
}
