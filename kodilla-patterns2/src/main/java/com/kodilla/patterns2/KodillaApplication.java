package com.kodilla.patterns2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class KodillaApplication {
    public static void main(String[] args) {
        SpringApplication.run(KodillaApplication.class, args);
    }
}

