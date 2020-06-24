package com.stefanN;

public class BronzeCard extends CardObject{

    BronzeCard(String owner, double turnover) {
        this.owner = owner;
        this.discountRate = calculateDiscountRate(turnover);
    }

    public double calculateDiscountRate(double turnover) {
        if(turnover < 100) {
            return 0;
        } else if(turnover > 100 && turnover < 300) {
            return 1;
        } else {
            return 2.5;
        }
    }
}
