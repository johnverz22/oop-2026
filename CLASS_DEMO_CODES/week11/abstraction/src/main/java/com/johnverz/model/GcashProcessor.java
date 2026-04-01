package com.johnverz.model;

import java.math.BigDecimal;

public class GcashProcessor extends PaymentProcessor {
    
    
    public GcashProcessor(String transactionId, BigDecimal amount){
        super(transactionId, amount);
    }

    @Override
    public void processPayment(){
        System.out.println("Connecting to Gcash API ... Charging " + getAmount().doubleValue());
    }
}
