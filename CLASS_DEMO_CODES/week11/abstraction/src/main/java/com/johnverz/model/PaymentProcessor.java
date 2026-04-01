package com.johnverz.model;

import java.math.BigDecimal;

public abstract class PaymentProcessor {
    private final String transactionId;
    private final BigDecimal amount;
    
    public PaymentProcessor(String transactionId, BigDecimal amount){
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }



    public BigDecimal getAmount() {
        return amount;
    }



    public void sendReceipt(){
        System.out.printf("""
            -------- Official Receipt -------
            TXN: %s
            Amount: %.2f 
                """, transactionId, amount.doubleValue());
    }

    public  abstract void processPayment();
    
}
