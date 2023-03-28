package com.kodilla.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class LibraryTestSuite {

    //@Autowired przed testami, zamiast w Given: ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.library");
    //Library library = context.getBean(Library.class);
    @Autowired
    private Library library;

    @Test
    void testSaveToDb() {
        //Given
        //When
        library.saveToDb();
        //Then
        //Do nothing
    }
    @Test
    void testLoadFromDb() {
        //Given
        //When
        library.loadFromDb();
        //Then
        //Do nothing
    }
}
