package com.github.alcbotta.querydslmovies;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class QuerydslmoviesApplicationTests {

	@Test
    public void testFirstTest() throws Exception {
       log.info("test");
    }

    

}
