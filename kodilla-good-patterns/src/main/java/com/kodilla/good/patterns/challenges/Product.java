package com.kodilla.good.patterns.challenges;

public class Product {
    String name;
    int amount;
    double price;

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public Product(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }


}
