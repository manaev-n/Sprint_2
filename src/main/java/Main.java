import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5,100);
        Food red_apples = new Apple(10, 50, "red");
        Food green_apples = new Apple(8, 60, "green");

        Food[] purchases = new Food[3];
        purchases[0] = meat;
        purchases[1] = red_apples;
        purchases[2] = green_apples;

        ShoppingCart shoppingCart = new ShoppingCart(purchases);

        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getSumWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: "+ shoppingCart.getSumWithDiscount());
        System.out.println("Cумма всех вегетарианских продуктов без скидки: "+ shoppingCart.getSumVegetarianWithoutDiscount());

    }
}
