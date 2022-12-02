package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class NullPointerExceptionRunner {

    public static void main(String[] args) {

        User user = null;
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMessageTo(user, "Hello!");
        } catch (MessageNotSentException e) {
            System.out.println(" Message is not send," +
                    "but my program is still running very well!");
        }
        System.out.println("Processing other logic!");

        //Opakowanie null usera typem Optional
        User user1 = new User("user1");
        Optional<User> optionalUser = Optional.ofNullable(user1);

        //Gdyby okazało się, że optionalUser zawiera w środku null,
        // metoda zwróci to, co przekazano jej jako argument,
        // czyli w naszym przypadku będzie to "pusty" obiekt klasy User.
        // Dzięki temu wywołanie metody getName() nie zakończy się wyjątkiem NullPointerException
        String username = optionalUser.orElse(new User("")).getName();
        System.out.println(username);
    }
}
