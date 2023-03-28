package com.kodilla.forum;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ForumUserTestSuite {

    @Test
    void testGetUsername() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.forum");
        Forum forum = context.getBean(ForumUser.class);

        //When
        String username = forum.getUsername();

        //Then
        assertEquals("John Smith", username);
    }
}
