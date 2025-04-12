package com.prep.loan;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class Loan {

    private String loanId;
    private double loanAmount;
    private double rate;
    private int tenure;
    private LoanStatus loanStatus;
    private LocalDate startDate;
    private List<Instalment> instalmentList = new ArrayList<>();

    Loan(String loanId, double loanAmount, double rate, int tenure){
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.rate = rate;
        this.tenure = tenure;
        this.startDate = LocalDate.now();
        this.loanStatus = LoanStatus.ACTIVE;
        calculateEMI();
    }

    private void calculateEMI() {
        double monthlyRate = rate / 12 / 100;

        double emi = loanAmount * monthlyRate * Math.pow(1+ monthlyRate, tenure) / (Math.pow(1 + monthlyRate, tenure) - 1);
        for (int i = 0; i < tenure; i++) {
            LocalDate dueDate = startDate.plusMonths(i);
            instalmentList.add(new Instalment(i, dueDate, emi));
        }



    }
}
