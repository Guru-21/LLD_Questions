package com.prep.creditCard;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CreditCard {

    private String cardId;
    private String cardName;
    private String bankName;
    private float minCreditScore;
    private double minIncome;
    private List<String> benefits;

}
