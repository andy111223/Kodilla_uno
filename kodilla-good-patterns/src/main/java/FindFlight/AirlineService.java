package FindFlight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AirlineService {
    private final List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> getAllFlightsFromCity(String city) {
        return flights.stream()
                .filter(flight -> flight.getFrom().equals(city))
                .collect(Collectors.toList());
    }

    public List<Flight> getAllFlightsToCity(String city) {
        return flights.stream()
                .filter(flight -> flight.getTo().equals(city))
                .collect(Collectors.toList());
    }

    public List<List<Flight>> getFlightsThroughCity(String from, String through, String to) {
        List<Flight> fromFlights = getAllFlightsFromCity(from);
        List<Flight> toFlights = getAllFlightsFromCity(through);

        return fromFlights.stream()
                .filter(flight -> flight.getTo().equals(through))
                .flatMap(flight -> toFlights.stream()
                        .filter(toFlight -> toFlight.getTo().equals(to))
                        .map(toFlight -> Arrays.asList(flight, toFlight)))
                .collect(Collectors.toList());
    }
}
