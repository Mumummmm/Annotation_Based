package com.pansy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.inject.Inject;
import java.util.Map;
import java.util.Set;

public class MovieRecommender {
    private CustomerPerferenceDao customerPerferenceDao;
    @Autowired
//    @Inject
    private MovieCatalog movieCatalog;
    @Autowired
    private MovieCatalog[] movieCatalogs;
    private Set<MovieCatalog> movieCatalogSet;
    private Map<String, MovieCatalog> movieCatalogMap;
    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
//    @Inject
    public void setMovieCatalogMap(Map<String, MovieCatalog> movieCatalogMap) {
        this.movieCatalogMap = movieCatalogMap;
    }

    @Autowired
    public void setMovieCatalogSet(Set<MovieCatalog> movieCatalogSet) {
        this.movieCatalogSet = movieCatalogSet;
    }

    @Autowired
//    @Inject
    public MovieRecommender(CustomerPerferenceDao customerPerferenceDao) {
        this.customerPerferenceDao = customerPerferenceDao;
    }

    @Autowired
    public void prepare(MovieCatalog movieCatalog, CustomerPerferenceDao customerPerferenceDao) {
        this.movieCatalog = movieCatalog;
        this.customerPerferenceDao = customerPerferenceDao;
    }
}
