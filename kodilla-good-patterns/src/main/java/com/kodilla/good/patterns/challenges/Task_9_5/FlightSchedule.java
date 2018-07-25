package com.kodilla.good.patterns.challenges.Task_9_5;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSchedule {

    public HashSet<Flight> flightSchedule = new HashSet<>();

    public FlightSchedule(HashSet<Flight> flightSchedule) {
        this.flightSchedule = flightSchedule;
    }

    public HashSet<Flight> getFlightSchedule() {
        return flightSchedule;
    }

    public void findFlightFromCity(String city) {
        System.out.println("Flights from: " + city);
        HashSet<Flight> result = new HashSet<>();
        flightSchedule.stream().filter(e -> e.getDepartureAirport().equals(city)).forEach(object -> result.add(object));
        if (result.size() == 0) {
            System.out.println("I'm sorry, there is no flight from this airport");
        } else {
            Iterator it = result.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    public void findFlightToCity(String city) {
        System.out.println("Flights to: " + city);
        HashSet<Flight> result = new HashSet<>();
        flightSchedule.stream().filter(e -> e.getArrivalAirport().equals(city)).forEach(object -> result.add(object));
        if (result.size() == 0) {
            System.out.println("I'm sorry, there is no flight to this city");
        } else {
            Iterator it = result.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    public void findFlightThrough(String from, String to, String through) {
        System.out.println("Flights from: " + from + " to: " + to + " through: " + through);
        HashSet<Flight> result = new HashSet<>();
        flightSchedule.stream().filter(e -> e.getDepartureAirport().equals(from) && e.getArrivalAirport().equals(through)).forEach(object -> result.add(object));
        flightSchedule.stream().filter(e -> e.getDepartureAirport().equals(through) && e.getArrivalAirport().equals(to)).forEach(object -> result.add(object));
        if (result.size() == 1) {
            System.out.println("I'm sorry, there is no such flight");
        } else {
            Iterator it = result.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}
