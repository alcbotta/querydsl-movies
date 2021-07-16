package com.github.alcbotta.querydslmovies.repositories;

import com.github.alcbotta.querydslmovies.models.Movie;
import com.github.alcbotta.querydslmovies.models.QMovie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

public interface MoviesRepository extends JpaRepository<Movie, Long>,
QuerydslPredicateExecutor<Movie>, QuerydslBinderCustomizer<QMovie> {
    @Override
        default void customize(QuerydslBindings bindings, QMovie registration) {
                bindings.excluding(registration.id);
                 }
}
