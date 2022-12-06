package com.kodilla;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FindFlight;
import com.kodilla.exception.test.RouteNotFoundException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
     public static void main(String[] args) throws RouteNotFoundException {


         FindFlight findFlight = new FindFlight();
         Flight flight = new Flight("Bern", "Denver");

         try {
             findFlight.findFlight(flight);
             System.out.println("Success - flights are found.");
         } catch (RouteNotFoundException e) {
             System.out.println("No such airport");
         }
         System.out.println("---The end of search---");
     }
}