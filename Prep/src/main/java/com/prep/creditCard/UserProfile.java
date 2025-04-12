package com.prep.creditCard;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserProfile {

    private String userID;
    private String name;
    private int age;
    private double minimumIncome;
    private float creditScore;
    private String employmentType;

}
