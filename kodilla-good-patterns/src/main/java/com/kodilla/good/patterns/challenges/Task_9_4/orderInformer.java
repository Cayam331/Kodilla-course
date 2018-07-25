package com.kodilla.good.patterns.challenges.Task_9_4;

public class orderInformer implements OrderInformation {
    public void orderInfo(Producer producer) {
        System.out.println("Information about order: \n" + "Producer name: " + producer.getName()
                + " \nProduct name: " + producer.getProduct().getName() + "\namount: " + producer.getProduct().getAmount());

    }
}
