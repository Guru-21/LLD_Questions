package com.prep.paymentgateway;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Data
public class PaymentGateway {

    private final Map<String, Payment> paymentMap = new HashMap<>();

    public Payment createPayment(double amount, PaymentMethod paymentMethod){

        String id = UUID.randomUUID().toString();
        Payment payment = new Payment(id, amount, paymentMethod);
        paymentMap.put(id, payment);
        return payment;
    }


    public Payment getPayment(String id){
        Payment payment = paymentMap.get(id);
        if(payment !=null){
            return payment;
        }else{
            System.out.println("No Payment Data  is present .");
            return null;
        }
    }

}
