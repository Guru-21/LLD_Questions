package com.prep.paymentgateway;

public class WalletPayment implements PaymentMethod{

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing Wallet payment of Rs : "+amount);
        return true;
    }

    @Override
    public String getPaymentMode() {
        return "WALLET";
    }
}
