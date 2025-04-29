package model;

import static model.constants.Colour.*;
import static model.constants.Discount.*;

public class Apple extends Food {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (this.colour == INCREASED_DISCOUNT_COLOUR) {
            return INCREASED_DISCOUNT;
        } else return USUAL_DISCOUNT;
    }
}




