package com.kodilla.exception.test;

public class Flight {
    String deaprtureAirport;
    String arrivalAirport;

    public String getDeaprtureAirport() {
        return deaprtureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public Flight(String deaprtureAirport, String arrivalAirport) {
        this.deaprtureAirport = deaprtureAirport;

        this.arrivalAirport = arrivalAirport;
    }
}
