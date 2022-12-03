package com.kodilla;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FindFlight;
import com.kodilla.exception.test.RouteNotFoundException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
     public static void main(String[] args) {

         Flight flight = new Flight("Atlanta", "Boston");
         FindFlight findFlight = new FindFlight();


         try {
             findFlight.findFlight(flight);
         } catch (RouteNotFoundException e) {
             System.out.println("No such airport");
         }
         System.out.println("The end of search");
     }
}