package com.johnverz.model;

import java.math.BigDecimal;

public class CryptoPayment extends PaymentProcessor {
    public CryptoPayment(String transactionId, BigDecimal amount){
        super(transactionId, amount);
    }

    @Override
    public void processPayment(){
        System.out.println("Connecting to Binance API ... Charging " + getAmount().doubleValue());
    }
}
