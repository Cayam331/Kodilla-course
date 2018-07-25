package com.kodilla.good.patterns.challenges.Task_9_5;

import java.util.ArrayList;
import java.util.HashSet;

public class DataLoader {
    public static HashSet<Flight> loadData() {

        Flight flightOne = new Flight("Kraków", "Wrocław");
        Flight flightTwo = new Flight("Wrocław", "Radom");
        Flight flightThree = new Flight("Radom", "Madryt");
        Flight flightFour = new Flight("Kraków", "Kabul");

        HashSet<Flight> resultSet = new HashSet<>();
        resultSet.add(flightOne);
        resultSet.add(flightTwo);
        resultSet.add(flightThree);
        resultSet.add(flightFour);

        return resultSet;

    }
}
