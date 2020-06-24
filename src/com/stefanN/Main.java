package com.stefanN;

public class Main {

    public static void main(String[] args) {
        // instantiate objects
	    BronzeCard bronze = new BronzeCard("User1", 0);
	    SilverCard silver = new SilverCard("User2", 600);
	    GoldCard gold = new GoldCard("User3", 1500);

	    // set purchase values
        double bronzePurchase = 150;
        double silverPurchase = 850;
        double goldPurchase = 1300;

	    // print desired output
        // for bronze card
        System.out.println("1. Bronze:");
        System.out.println("a. Mock data: turnover $" + bronze.getTurnover() + ", purchase value $" + bronzePurchase);
        System.out.println("b. Output:");
        bronze.outputData(bronzePurchase);

        System.out.println();
        // for silver card
        System.out.println("1. Silver:");
        System.out.println("a. Mock data: turnover $" + silver.getTurnover() + ", purchase value $" + silverPurchase);
        System.out.println("b. Output:");
        silver.outputData(silverPurchase);

        System.out.println();
        // for gold card
        System.out.println("1. Gold:");
        System.out.println("a. Mock data: turnover $" + gold.getTurnover() + ", purchase value $" + goldPurchase);
        System.out.println("b. Output:");
        gold.outputData(goldPurchase);
    }
}
