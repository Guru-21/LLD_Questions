package com.prep.loan;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Instalment {

    private int numberOfInstallment;
    private LocalDate dueDate;
    private double emi;
    private boolean paid;

    Instalment(int numberOfInstallment, LocalDate dueDate, double emi) {
        this.numberOfInstallment = numberOfInstallment;
        this.dueDate =dueDate;
        this.emi = emi;
        this.paid = false;
    }

    public void markAsPaid(){
        this.paid = true;
    }
}
