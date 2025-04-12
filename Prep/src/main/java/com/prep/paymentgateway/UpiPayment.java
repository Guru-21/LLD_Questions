package com.prep.paymentgateway;

public class UpiPayment implements PaymentMethod{

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing UPI payment of Rs : "+amount);
        return true;    }

    @Override
    public String getPaymentMode() {
        return "UPI";
    }
}
