package FindFlight;

public class FindFlightMain {
    public static void main(String[] args) {
        AirlineService airlineService = new AirlineService();

        airlineService.addFlight(new Flight("GDAŃSK", "WROCŁAW"));
        airlineService.addFlight(new Flight("GDAŃSK", "KRAKÓW"));
        airlineService.addFlight(new Flight("KRAKÓW", "WROCŁAW"));
        airlineService.addFlight(new Flight("WARSZAWA", "POZNAŃ"));

        System.out.println(airlineService.getAllFlightsFromCity("GDAŃSK"));
        System.out.println(airlineService.getAllFlightsToCity("WROCŁAW"));
        System.out.println(airlineService.getFlightsThroughCity("GDAŃSK", "KRAKÓW", "WROCŁAW"));
    }
}
