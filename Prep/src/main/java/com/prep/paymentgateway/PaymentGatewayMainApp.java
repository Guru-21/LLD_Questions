package com.prep.paymentgateway;

public class PaymentGatewayMainApp {

    public static void main(String[] args) {

        PaymentGateway paymentGateway = new PaymentGateway();
        Payment creditCardPayment = paymentGateway.createPayment(8550.20, new CreditCardPayment());
        creditCardPayment.processPayment();

        Payment upiPayment  = paymentGateway.createPayment(7855, new UpiPayment());
        upiPayment.processPayment();
        Payment upiPaymentData = paymentGateway.getPayment(upiPayment.getPaymentId());
        System.out.println("upi payment data : "+upiPaymentData);


        System.out.println("Credit Card Payment status : "+creditCardPayment.getPaymentStatus());
        System.out.println("UPI Payment status : "+upiPayment.getPaymentStatus());




    }
}
