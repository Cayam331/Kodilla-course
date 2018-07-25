package com.kodilla.good.patterns.challenges.Task_9_5;

public class FlightMapRunner {
    public static void main(String args[]) {

        FlightSchedule flightSchedule = new FlightSchedule(DataLoader.loadData());
        flightSchedule.findFlightFromCity("Kraków");
        flightSchedule.findFlightToCity("Warszawa");
        flightSchedule.findFlightThrough("Wrocław", "Madryt", "Radom");


    }
}
