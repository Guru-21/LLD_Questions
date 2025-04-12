package com.prep.loan;

public class LoanSystemMainApp {

    public static void main(String[] args) {
        LoanService loanService = new LoanService();

        loanService.registerCustomer("Cust001", "Gurpreet Singh", 25);
        loanService.registerCustomer("Cust002", "Sarvjeet Singh", 27);

        loanService.applyForLoan("Cust001", 50000, 7.5, 10);


        String loanId = loanService.getLoanId("Cust001");

        loanService.payInstallments("Cust001", loanId, 1);
        loanService.payInstallments("Cust001", loanId, 2);
        loanService.payInstallments("Cust001", loanId, 3);

        loanService.viewAllInstallmentData("Cust001");





    }
}
