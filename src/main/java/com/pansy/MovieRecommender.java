package com.pansy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;

import java.util.Map;
import java.util.Set;

public class MovieRecommender {
    @Autowired
    private CustomerPerferenceDao customerPerferenceDao;
    @Autowired
//    @Inject
    @Genre(value = "Action")
    private MovieCatalog actionCatalog;
    private MovieCatalog comedyCatalog;
    @Autowired
    @Qualifier("main")
    private MovieCatalog movieCatalog;
    @Autowired
    private MovieCatalog[] movieCatalogs;
    private Set<MovieCatalog> movieCatalogSet;
    private Map<String, MovieCatalog> movieCatalogMap;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    @Offline
    private MovieCatalog offlineCatalog;
    @Autowired
    @MovieQualifier(format = Format.VHS, genre = "Action")
    private MovieCatalog actionVhsCatalog;
    @Autowired
    @MovieQualifier(format = Format.VHS, genre = "Comedy")
    private MovieCatalog comedyVhsCatalog;
    @Autowired
    @MovieQualifier(format = Format.DVD, genre = "Action")
    private MovieCatalog actionDvdCatalog;
    @Autowired
    @MovieQualifier(format = Format.BLURAY, genre = "Comedy")
    private MovieCatalog comedyBlurayCatalog;

    public void setComedyCatalog(@Genre("Comedy") MovieCatalog comedyCatalog) {
        this.comedyCatalog = comedyCatalog;
    }

    @Autowired
//    @Inject
    public void setMovieCatalogMap(Map<String, MovieCatalog> movieCatalogMap) {
        this.movieCatalogMap = movieCatalogMap;
    }

    @Autowired
    public void setMovieCatalogSet(Set<MovieCatalog> movieCatalogSet) {
        this.movieCatalogSet = movieCatalogSet;
    }

    public MovieRecommender() {
    }

    @Autowired
//    @Inject
    public MovieRecommender(CustomerPerferenceDao customerPerferenceDao) {
        this.customerPerferenceDao = customerPerferenceDao;
    }

    @Autowired
    public void prepare(@Qualifier("action") MovieCatalog movieCatalog, CustomerPerferenceDao customerPerferenceDao) {
        this.movieCatalog = movieCatalog;
        this.customerPerferenceDao = customerPerferenceDao;
    }
}
