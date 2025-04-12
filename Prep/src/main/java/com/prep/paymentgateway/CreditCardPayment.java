package com.prep.paymentgateway;

public class CreditCardPayment implements PaymentMethod{

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing Credit Card payment of Rs : "+amount);
        return true;
    }

    @Override
    public String getPaymentMode() {
        return "CREDIT CARD";
    }
}
