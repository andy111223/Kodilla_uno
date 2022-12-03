package com.kodilla.exception.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FindFlight {

    Map<String, Boolean> flightsMap = new HashMap<>();

    public Map<String, Boolean> findFlight (Flight flight) throws RouteNotFoundException {

        try (flightsMap.get()) {
            return flightsMap.entrySet();
        } catch (KeyNotFoundException e){
            throw new RouteNotFoundException("Airport not found.");
        }
        System.out.println("Aiport search finished.");
    }
}
