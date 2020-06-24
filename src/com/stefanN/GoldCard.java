package com.stefanN;

public class GoldCard extends CardObject {

    GoldCard(String owner, double turnover) {
        this.owner = owner;
        this.discountRate = calculateDiscountRate(turnover);
    }

    public double calculateDiscountRate(double turnover) {
        int growth = (int)turnover / 100;
        if(growth > 8) {
            return 10;
        } else {
            return 2 + growth;
        }
    }
}
