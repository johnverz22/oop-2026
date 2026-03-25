package com.johnverz.model;

import java.math.BigDecimal;

public class MayaProcessor extends PaymentProcessor {
    public MayaProcessor(String transactionId, BigDecimal amount){
        super(transactionId, amount);
    }

    @Override
    public void processPayment(){
        System.out.println("Connecting to Maya API ... Chargint " + getAmount().doubleValue());
    }
}

