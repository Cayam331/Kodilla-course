package com.kodilla.good.patterns.challenges.Task_9_4;

public class ExtraHealthyShop implements Producer {
    String name;
    Product product;

    public ExtraHealthyShop(String name, Product product) {
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public Product getProduct() {
        return product;
    }

    public boolean process() {
        System.out.println("Processing ExtraHealthyShop order");
        return true;
    }
}


