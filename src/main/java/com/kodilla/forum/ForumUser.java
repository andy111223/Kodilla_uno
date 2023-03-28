package com.kodilla.forum;

import org.springframework.stereotype.Component;


@Component
public class ForumUser implements Forum {

    @Override
    public String getUsername() {
        return "John Smith";
    }
}
