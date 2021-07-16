package com.github.alcbotta.querydslmovies.services;
import com.github.alcbotta.querydslmovies.models.Movie;
import com.github.alcbotta.querydslmovies.repositories.MoviesRepository;
import com.querydsl.core.types.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class MovieService {
    @Autowired
    private MoviesRepository moviesRepository;

    public Iterable <Movie> list (Predicate predicate){
        return moviesRepository.findAll(predicate);
    }

    public Movie save (Movie movie){
        return moviesRepository.save(movie);
    }
}
