package com.kodilla.good.patterns.challenges;

public class ShopRunner {
    public static void main(String[] args) {
        TransactionRequestRetriver transactionRequestRetriver = new TransactionRequestRetriver();
        TransactionRequest transactionRequest = transactionRequestRetriver.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new TransactionRepository(), new SellProcessor(), new InformationProcess());
        productOrderService.process(transactionRequest);


    }
}
