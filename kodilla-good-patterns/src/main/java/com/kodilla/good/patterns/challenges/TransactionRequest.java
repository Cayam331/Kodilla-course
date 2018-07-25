package com.kodilla.good.patterns.challenges;

public class TransactionRequest {
    private Customer customer;
    private Product product;

    public TransactionRequest(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }
}
