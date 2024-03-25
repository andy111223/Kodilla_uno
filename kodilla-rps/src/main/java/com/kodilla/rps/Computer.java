package com.kodilla.rps;

import java.util.Random;

public class Computer {
    Gamer gamer2;

    public Computer(Gamer gamer2) {
        this.gamer2 = gamer2;
    }

    public int random() {
        Random generator = new Random();
        int random = generator.nextInt(3);
        return random + 1;
    }
}
