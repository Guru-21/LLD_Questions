package com.prep.creditCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditCardRecommendation {

    private List<CreditCard> creditCardList;


    public CreditCardRecommendation(){
        creditCardList = new ArrayList<>();
        loadMockCreditCardData();
    }

    private void loadMockCreditCardData() {
        creditCardList.add(new CreditCard("card01", "Silver Card", "SBI", 720, 50000, Arrays.asList("Cashback", "Travel", "Fuel")));
        creditCardList.add(new CreditCard("card02", "Gold Card", "HDFC", 780, 75000, Arrays.asList("Cashback", "Travel", "Fuel", "Dining")));
        creditCardList.add(new CreditCard("card03", "Platinum Card", "ICICI", 800, 80000, Arrays.asList("Cashback", "Travel", "Fuel", "Airport Lounge", "Dining")));
    }

    public List<CreditCard> recommendCreditCard(UserProfile userProfile){
        List<CreditCard> recommendedCards = new ArrayList<>();
        for (CreditCard creditCard : creditCardList){
            if(creditCard.getMinCreditScore() <= userProfile.getCreditScore() &&
            creditCard.getMinIncome() <= userProfile.getMinimumIncome()){
                recommendedCards.add(creditCard);
            }
        }
        return recommendedCards;
    }

}
