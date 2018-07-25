package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private SaveTransaction saveTransaction;
    private SellProduct sellProduct;
    private TransactionInfo transactionInfo;

    public ProductOrderService(final SaveTransaction saveTransaction, final SellProduct sellProduct, final TransactionInfo transactionInfo) {
        this.saveTransaction = saveTransaction;
        this.sellProduct = sellProduct;
        this.transactionInfo = transactionInfo;
    }

    public TransactionDTO process(final TransactionRequest transactionRequest) {
        boolean isTransactionFinished = sellProduct.sellProduct(transactionRequest.getCustomer(), transactionRequest.getProduct());
        if (isTransactionFinished) {
            transactionInfo.customerInfrom(transactionRequest.getCustomer());
            saveTransaction.saveTransaction(transactionRequest.getCustomer(), transactionRequest.getProduct());
            return new TransactionDTO(transactionRequest.getCustomer(), transactionRequest.getProduct(), true);
        } else {
            return new TransactionDTO(transactionRequest.getCustomer(), transactionRequest.getProduct(), false);
        }

    }
}
