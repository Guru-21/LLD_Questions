package com.prep.loan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class LoanService {

    private Map<String, Customer> customerMap = new HashMap<>();

    public  void registerCustomer(String customerId, String name, int age){
        customerMap.put(customerId, new Customer(customerId, name, age));
    }

    public void applyForLoan(String customerId, double amount, double rate, int tenure){

        Customer customer = customerMap.get(customerId);
        if(customer == null){
            throw new IllegalArgumentException("Customer not found");
        }

        String loanId = UUID.randomUUID().toString();
        Loan loan = new Loan(loanId, amount, rate, tenure);
        customer.setLoan(loan);
        System.out.printf("LoanID : %s is created for Customer name : %s with customer id %s%n",loanId, customer.getName(), customerId);
    }

    public void viewAllInstallmentData(String customerId){

        Customer customer = customerMap.get(customerId);
        if(customer == null){
            throw new IllegalArgumentException("Customer not found");
        }

        List<Instalment> instalmentList = customer.getLoan().getInstalmentList();

        for (Instalment instalment : instalmentList){
            System.out.println("Installment : " + (instalment.getNumberOfInstallment() + 1) + " due on "+ instalment.getDueDate() + " - amount "+ instalment.getEmi() + " Paid: "+ instalment.isPaid());
        }
    }


    public void payInstallments(String customerId, String loanId, int installmentNumber){

        Customer customer = customerMap.get(customerId);
        if(customer == null){
            throw new IllegalArgumentException("Customer not found");
        }

        Loan loan = customer.getLoan();

        if (loan != null && loan.getLoanId().equalsIgnoreCase(loanId)) {

            Instalment instalment = loan.getInstalmentList().get(installmentNumber - 1);
            if(!instalment.isPaid()){
                instalment.markAsPaid();
                System.out.println("Installment : "+installmentNumber + " marked as paid.");
            }else{
                System.out.println("Installment : "+installmentNumber + " already paid");
            }
        }else{
            System.out.println("Loan Not Found!!!");
        }
    }

    public String getLoanId(String customerId){
        Customer customer = customerMap.get(customerId);
        if(customer == null){
            throw new IllegalArgumentException("Customer not found");
        }

        Loan loan = customer.getLoan();
        if(loan != null){
            return loan.getLoanId();
        }else {
            System.out.println("Loan Not Found!!!");
            return null;
        }
    }

}
