package com.kodilla.good.patterns.challenges.Task_9_4;

public class OrderService {
    OrderInformation orderInformation;
    Producer producer;
    SaveOrder saveOrder;

    public OrderService(OrderInformation orderInformation, Producer orderProcess, SaveOrder saveOrder) {
        this.orderInformation = orderInformation;
        this.producer = orderProcess;
        this.saveOrder = saveOrder;
    }

    public OrderDTO process1(final OrderRequest orderRequest) {
        boolean isOrderPositive = producer.process();
        if (isOrderPositive) {
            orderInformation.orderInfo(orderRequest.getProducer());
            saveOrder.saveOrder(orderRequest.getProducer());
            System.out.println("Order was succesfull");
            return new OrderDTO(orderRequest.getProduct(), orderRequest.getProducer(), true);
        } else {
            System.out.println("Order was unsuccesfull");
            return new OrderDTO(orderRequest.getProduct(), orderRequest.getProducer(), false);
        }


    }
}
