package com.kodilla.rps;

public class Paper implements Thing{
    public String getThingName() {
        return "Wybrales 2 - Paper";
    }

    @Override
    public String toString() {
        return getThingName();
    }
}
