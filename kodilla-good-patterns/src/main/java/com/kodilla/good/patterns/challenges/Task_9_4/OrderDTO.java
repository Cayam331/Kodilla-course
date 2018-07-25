package com.kodilla.good.patterns.challenges.Task_9_4;

public class OrderDTO {
    private Product product;
    private Producer producer;
    private boolean isOrderCompleted;

    public Product getProduct() {
        return product;
    }

    public Producer getProducer() {
        return producer;
    }

    public OrderDTO(Product product, Producer producer, boolean isOrderCompleted) {

        this.product = product;
        this.producer = producer;
        this.isOrderCompleted = isOrderCompleted;
    }

}
