package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Okecie", true);
        flights.put("Chopina", false);
        flights.put("Lawica", false);
        flights.put("Modlin", true);

        if (!flights.containsKey(flight.getDeaprtureAirport())) {
            throw new RouteNotFoundException("There is no such airport");
        }

        for (Map.Entry<String, Boolean> e : flights.entrySet()) {
            if (e.getKey().equals(flight.getArrivalAirport()) && e.getValue() == true) {
                System.out.println("Flight from " + flight.getDeaprtureAirport() + " to " + flight.getArrivalAirport() + " is possible");
            }
            if (e.getKey().equals(flight.getArrivalAirport()) && e.getValue() == false) {
                System.out.println("Flight from " + flight.getDeaprtureAirport() + " to " + flight.getArrivalAirport() + " is not possible");
            }
        }
    }
}





