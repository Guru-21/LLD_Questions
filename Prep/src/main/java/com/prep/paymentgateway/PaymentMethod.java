package com.prep.paymentgateway;

public interface PaymentMethod {
    boolean processPayment(double amount);
    String getPaymentMode();
}
