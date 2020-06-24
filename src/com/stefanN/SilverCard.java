package com.stefanN;

public class SilverCard extends CardObject {

    SilverCard(String owner, double turnover) {
        this.owner = owner;
        this.discountRate = calculateDiscountRate(turnover);
    }

    public double calculateDiscountRate(double turnover) {
        if(turnover > 300) {
            return 3.5;
        }
        return 2;
    }
}
