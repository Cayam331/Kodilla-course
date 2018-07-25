package com.kodilla.good.patterns.challenges;

public class Customer {
    private String lastName;
    private String email;

    public Customer(String lastName, String email) {
        this.lastName = lastName;
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return email;
    }


}
