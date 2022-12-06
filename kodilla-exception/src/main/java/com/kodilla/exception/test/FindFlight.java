package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    private final Map<String, Boolean> airportMap;

    public FindFlight(Map<String, Boolean> airportMap) {
        this.airportMap = airportMap;
    }

    public boolean findFlight (Flight flight) throws RouteNotFoundException {

        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }

    private boolean findAirport(String airportName) throws RouteNotFoundException {

        if (airportMap.containsKey(airportName)) {
            return airportMap.get(airportName);
        } else {
            throw new RouteNotFoundException("Airport not found.");
        }
    }

    private Map<String, Boolean> airports() {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Atlanta", true);
        airports.put("Boston", true);
        airports.put("Chicago", false);
        airports.put("Denver", false);

        return airports;
    }
}
