package com.kodilla.good.patterns.challenges;

public class TransactionDTO {
    private Customer customer;
    private Product product;
    private boolean shoppingSucedded;

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public TransactionDTO(Customer customer, Product product, boolean shoppingSucedded) {

        this.customer = customer;
        this.product = product;
        this.shoppingSucedded = shoppingSucedded;
    }

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "customer=" + customer +
                ", product=" + product +
                '}';
    }
}
