package com.johnverz.model;

import java.math.BigDecimal;

public class CardProcessor extends PaymentProcessor{
    public CardProcessor(String transactionId, BigDecimal amount){
        super(transactionId, amount);
    }

    @Override
    public void processPayment(){
        System.out.println("Connecting to Visa/MasterCard/American Express API ... Charging " + getAmount().doubleValue());
    }
}
