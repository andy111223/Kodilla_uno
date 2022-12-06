package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {


    public boolean findFlight (Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightsMap = new HashMap<>();

        try {
            if (flightsMap.containsKey(flight.getArrivalAirport())) {
                return flightsMap.containsKey(flight.getArrivalAirport());
            }
        } catch (Exception e){
            throw new RouteNotFoundException("Airport not found.");
        }
        System.out.println("Aiport search finished.");
        return false;
    }
}
