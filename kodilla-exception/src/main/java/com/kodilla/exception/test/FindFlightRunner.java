package com.kodilla.exception.test;

public class FindFlightRunner {
    public static void main(String[] args) {

        Flight flight2 = new Flight("Modlin", "Lawica");
        Flight flight3 = new Flight("Chopina", "Modlin");
        Flight flight4 = new Flight("Chopinaasasasasa", "Modlin");

        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight4);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }

    }
}
