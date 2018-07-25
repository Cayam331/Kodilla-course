package com.kodilla.good.patterns.challenges.Task_9_5;

import java.util.Objects;

public class Flight {
    String departureAirport;
    String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return
                "Departure airport: " + departureAirport +
                        ", arrival airport: " + arrivalAirport;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getDepartureAirport(), flight.getDepartureAirport()) &&
                Objects.equals(getArrivalAirport(), flight.getArrivalAirport());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDepartureAirport(), getArrivalAirport());
    }
}
