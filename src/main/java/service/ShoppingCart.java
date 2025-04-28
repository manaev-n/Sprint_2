package service;

import model.Food;

public class ShoppingCart {
    Food[] purchases;
    public ShoppingCart(Food[] purchases) {
        this.purchases = purchases;
    }
    public double getSumWithoutDiscount() {
        double sumWithoutDiscount = 0;
        for (int i = 0; i < purchases.length; i++) {
            sumWithoutDiscount += purchases[i].getAmount() * purchases[i].getPrice();
        }
        return sumWithoutDiscount;
    }
    public double getSumWithDiscount() {
        double sum = 0;
        double sumWithDiscount = 0;
        double disc = 0;
        for (int i = 0; i < purchases.length; i++) {
            sum += purchases[i].getAmount() * purchases[i].getPrice();
            disc += ((purchases[i].getDiscount() * 1) / 100) * purchases[i].getAmount() * purchases[i].getPrice();
            sumWithDiscount = sum - disc;
        }
        return sumWithDiscount;
    }

    public double getSumVegetarianWithoutDiscount() {
        double sumVegetarianWithoutDiscount = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i].getIsVegetarian()) {
                sumVegetarianWithoutDiscount += purchases[i].getAmount() * purchases[i].getPrice();
            }
        }
        return sumVegetarianWithoutDiscount;
    }
}

