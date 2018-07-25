package com.kodilla.good.patterns.challenges.Task_9_4;

public class OrderTaskRunner {
    public static void main(String[] args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        OrderService orderService = new OrderService(new orderInformer(), new ExtraHealthyShop(orderRequest.getProducer().getName(), orderRequest.getProduct()), new OrderSaver());
        orderService.process1(orderRequest);


    }
}
