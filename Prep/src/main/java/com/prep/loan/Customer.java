package com.prep.loan;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Customer {

    private String customerId;
    private String name;
    private int age;
    private Loan loan;

    Customer(String customerId, String name, int age){
        this.customerId = customerId;
        this.name = name;
        this.age = age;
    }

}
