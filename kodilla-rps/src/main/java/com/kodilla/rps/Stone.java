package com.kodilla.rps;

public class Stone implements Thing {
    //String name;
    public String getThingName() {
        return "Wybrales 1 - Stone";
    }

    @Override
    public String toString() {
        return getThingName();
    }
}
