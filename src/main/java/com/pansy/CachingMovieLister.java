package com.pansy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CachingMovieLister {

    @PostConstruct
    public void populateMovieCaching() {
        // populates the movie cache upon initialization
    }

    @PreDestroy
    public void clearMovieCache() {
        // clears the movie cache upon destruction
    }
}
