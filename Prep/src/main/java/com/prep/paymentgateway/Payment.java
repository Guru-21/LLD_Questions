package com.prep.paymentgateway;

import lombok.Data;

@Data
public class Payment {
    private String paymentId;
    private double amount;
    private PaymentStatus paymentStatus;
    private PaymentMethod paymentMethod;


    Payment(String paymentId, double amount, PaymentMethod paymentMethod){
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = PaymentStatus.INITIATED;
    }

    public void processPayment(){
        System.out.println("Payment is being initiated with id: "+paymentId);
        boolean paymentResult = paymentMethod.processPayment(amount);
       paymentStatus = paymentResult ? PaymentStatus.SUCCESS : PaymentStatus.FAILURE;
        System.out.println("Payment " + paymentStatus.name() + " via "+ paymentMethod.getPaymentMode());
    }
}
