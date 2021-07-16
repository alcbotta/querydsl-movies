package com.github.alcbotta.querydslmovies.services;
import com.github.alcbotta.querydslmovies.models.Movie;
import com.github.alcbotta.querydslmovies.models.QMovie;
import com.querydsl.core.BooleanBuilder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ActiveProfiles;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;


@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MovieServicesTests {

    @Autowired
    MovieService movieService;
    
    @Test
    public void testFirst() throws Exception {
       log.info("test");
       Movie m = new Movie ();
       m.setName("test");
       m = movieService.save(m);
       Assert.assertNotEquals(0, m.getId().longValue());
    }
    
}
