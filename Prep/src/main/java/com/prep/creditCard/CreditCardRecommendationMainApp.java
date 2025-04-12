package com.prep.creditCard;

import java.util.List;
import java.util.Scanner;

public class CreditCardRecommendationMainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter User Name : ");
        String name = scanner.nextLine();

        System.out.println("Enter User age : ");
        int age = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Enter User credit score : ");
        float creditScore = scanner.nextFloat();
        scanner.nextLine();


        System.out.println("Enter User minimum  income : ");
        double minimumIncome = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("Enter User Employment Type (SALARIED / SELF_EMPLOYED)  : ");
        String employmentType = scanner.nextLine();

        UserProfile userProfile = new UserProfile("user01", name, age, minimumIncome, creditScore, employmentType);

        CreditCardRecommendation creditCardRecommendation = new CreditCardRecommendation();
        List<CreditCard> creditCards = creditCardRecommendation.recommendCreditCard(userProfile);

        System.out.println("Recommended credit card : ");
        System.out.println("=========================");
        if(creditCards.size() > 0 ){
            for (CreditCard creditCard : creditCards){

                System.out.println(creditCard.getCardName() + " by "+creditCard.getBankName() + " bank with benefits includes " + creditCard.getBenefits() );
            }
        }else{
            System.out.println("There is no credit card available according to your data!");
        }



    }
}
