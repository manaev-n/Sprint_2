package model;

import static model.constants.Colour.increasedDiscountColour;
import static model.constants.Discount.usualDiscount;
import static model.constants.Discount.increasedDiscount;

public class Apple extends Food{
   public String colour;

   public Apple(int amount, double price, String colour) {
       this.amount = amount;
       this.price = price;
       this.colour = colour;
       this.isVegetarian = true;
   }
   @Override
   public double getDiscount() {
       if (this.colour == increasedDiscountColour) {
           return increasedDiscount;
       } else return usualDiscount;
   }

   }




