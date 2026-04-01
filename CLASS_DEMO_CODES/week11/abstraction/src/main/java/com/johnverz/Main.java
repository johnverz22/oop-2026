package com.johnverz;

import java.math.BigDecimal;

import com.johnverz.model.CardProcessor;
import com.johnverz.model.CryptoPayment;
import com.johnverz.model.GcashProcessor;
import com.johnverz.model.MayaProcessor;
import com.johnverz.model.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        String txnId = "TXN" + System.currentTimeMillis();
        PaymentProcessor txn = new CryptoPayment(txnId, new BigDecimal(1500.99));
        checkout(txn);
    }
    public static void checkout(PaymentProcessor txn){
        txn.processPayment();
        txn.sendReceipt();
    }
}