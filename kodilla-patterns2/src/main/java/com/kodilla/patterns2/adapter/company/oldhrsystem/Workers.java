package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [][] workers = {
            {"687346343673", "Jaroslaw", "Kaczynski"},
            {"398475384953", "Donald", "Tusk"},
            {"893475384533", "Pawel", "Kukiz"},
            {"232335454444", "Beata", "Szydlo"},
            {"034935623232", "Janusz", "Tracz"}};

    private double [] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};

    public String getWorker(int n){
        if(n> salaries.length){
            return "";
        }
        return workers[n][0] + ", " + workers [n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String [][] getWorkers(){
        return workers;
    }

    public double [] getSalaries() {
        return salaries;
    }
}
