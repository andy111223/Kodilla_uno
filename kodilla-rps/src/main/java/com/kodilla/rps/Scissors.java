package com.kodilla.rps;

public class Scissors implements Thing {
    public String getThingName() {
        return "Wybrales 3 - Scissors";
    }

    @Override
    public String toString() {
        return getThingName();
    }
}
