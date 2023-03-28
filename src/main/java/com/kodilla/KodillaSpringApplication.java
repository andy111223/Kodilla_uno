package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(KodillaSpringApplication.class, args);

        for(String arg : args) {
            System.out.println("Here is the printout: " + arg);
        }


    }

}
