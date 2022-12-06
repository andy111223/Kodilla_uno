package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    private final Map<String, Boolean> airportMap;

    public FindFlight() {
        airportMap = airportDataBase();
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }

    private boolean findAirport(String airportName) throws RouteNotFoundException{
        if (airportMap.containsKey(airportName)) {
            return airportMap.get(airportName);
        }else{
            throw new RouteNotFoundException("Airport does not exist!");
        }//poprawic, zeby dwa razy nie odpytywac.
    }

    private Map<String, Boolean> airportDataBase() {
        Map<String, Boolean> airportDataBase = new HashMap<>();
        airportDataBase.put("Bern", true);
        airportDataBase.put("Los Angeles", true);
        airportDataBase.put("Denver", false);
        airportDataBase.put("Brasila", false);
        airportDataBase.put("Canberra", true);

        return airportDataBase;
    }
}
