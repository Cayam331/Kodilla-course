package com.kodilla.good.patterns.challenges.Task_9_4;

public class OrderRequest {
    private Producer producer;
    private Product product;

    public OrderRequest(ExtraHealthyShop producer, Product product) {
        this.producer = producer;
        this.product = product;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }
}
