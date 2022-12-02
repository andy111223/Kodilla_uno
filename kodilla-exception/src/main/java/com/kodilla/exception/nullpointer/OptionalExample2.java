package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {

        User user = new User("User1");

        Optional<User> optionalUser = Optional.ofNullable(user);

        optionalUser.ifPresent(u -> System.out.println(u.getName()));

        //wykonuje to, co zapakowane w Optional, ale tylko wtedy,
        // gdy opakowany obiekt ma wartość inną niż null.
        // W przeciwnym wypadku żadna akcja nie zostaje wykonana
    }
}
