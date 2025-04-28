package model;

import static model.constants.Discount.usualDiscount;

public abstract class Food implements Discountable {
   protected int amount;
   protected double price;
   protected boolean isVegetarian;
   @Override
   public double getDiscount() {
      return usualDiscount;
   }
   public int getAmount() {
      return amount;
   }
   public double getPrice() {
      return price;
   }
   public boolean getIsVegetarian() {
      return isVegetarian;
   }
}

