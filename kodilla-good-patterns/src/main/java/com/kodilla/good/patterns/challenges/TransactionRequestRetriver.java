package com.kodilla.good.patterns.challenges;

public class TransactionRequestRetriver {
    public TransactionRequest retrieve() {
        Customer customer = new Customer("Kowalski", "Kowalski@gmail.com");
        Product product = new Product("Monitor", 2, 50.0);
        return new TransactionRequest(customer, product);

    }
}
