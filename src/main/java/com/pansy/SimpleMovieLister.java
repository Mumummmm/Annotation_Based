package com.pansy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;

public class SimpleMovieLister {
    private MovieFinder movieFinder;

    @Required
    @Autowired(required = false)
    @Resource(name = "myMovieFinder")
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

//    @Resource
//    public void setMovieFinder(MovieFinder movieFinder) {
//        this.movieFinder = movieFinder;
//    }
}
