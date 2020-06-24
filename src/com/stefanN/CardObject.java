package com.stefanN;

abstract class CardObject {
    String owner;
    double turnover;
    double discountRate;

    private double calculateDiscountSize(double valueOfPurchase) {
        // check if the price is above 0
        if(valueOfPurchase <= 0) {
            throw new IllegalArgumentException("Purchase has invalid price!");
        }
        // Since I'm setting the discount rate as a double number I have to divide the result by 100
        // to receive the percentage
        try {
            return valueOfPurchase * this.discountRate / 100;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return 0;
        }
    }

    double getTurnover() {
        return this.turnover;
    }

    void outputData(double valueOfPurchase) {
        double discount = calculateDiscountSize(valueOfPurchase);
        System.out.println("Purchase value: $" + valueOfPurchase);
        System.out.println("Discount rate: " + this.discountRate + "%");
        System.out.println("Discount: $" + discount);
        System.out.println("Total: $" + (valueOfPurchase - discount));
    }

    // has to be implemented by each class that extends the abstract class
    abstract double calculateDiscountRate(double turnover);
}
