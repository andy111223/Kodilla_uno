package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User kulfon82 = new Millenials("Albert Kulfon-stein");
        User elfica95 = new YGeneration("Juliusz Dzban");
        User xxx2004 = new ZGeneration("Michaela Zazdrosna");

        //When
        String kulfon82share = kulfon82.sharePost();
        System.out.println("Albert Kulfon-stein shares on: " + kulfon82share);
        String elfica95share = elfica95.sharePost();
        System.out.println("Juliusz Dzban shares on: " + elfica95share);
        String xxx2004share = xxx2004.sharePost();
        System.out.println("Michaela Zazdrosna shares on: " + xxx2004share);

        //Then
        assertEquals("Facebook", kulfon82share);
        assertEquals("Twitter", elfica95share);
        assertEquals("Snapchat", xxx2004share);

    }
    @Test
    void testIndividualSharingStrategy() {
        //Given
        User matello10 = new ZGeneration("Mateusz von Graben");

        //When
        String matello10share = matello10.sharePost();
        System.out.println("Mateusz von Graben shares on: " + matello10share);

        matello10.setSharingStrategy(new FacebookPublisher());
        matello10share = matello10.sharePost();
        System.out.println("Mateusz von Graben now shares on: " + matello10share);

        //Then
        assertEquals("Facebook", matello10share);
    }
}
