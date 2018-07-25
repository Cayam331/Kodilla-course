package com.kodilla.good.patterns.challenges.Task_9_4;

public class OrderRequestRetriver {
    public OrderRequest retrieve() {
        Product product = new Product("Klapki ", 10);
        ExtraHealthyShop producer = new ExtraHealthyShop("Extra Healthy Shop ", product);
        return new OrderRequest(producer, product);
    }
}
