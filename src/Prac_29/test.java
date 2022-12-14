package Prac_29;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Order restaurantOrder = new RestaurantOrder();
        restaurantOrder.add(new Dish(500, "DishNameOne", "DishNameOneDescription"));
        restaurantOrder.add(new Drink(200, "DrinkNameOne", "DrinkNameOneDescription"));
        System.out.println(Arrays.toString(restaurantOrder.getMenu()));
        System.out.println("\n" + "Restaurant orders: ");
        OrderManager orderManager = new OrderManager();
        try{
            orderManager.add(restaurantOrder, 1);
        } catch (OrderException e) {
            System.out.println(e.getMessage());
        }
        OrderManager orderManager1 = new OrderManager();
        Order internetOrder = new InternetOrder();
        internetOrder.add(new Dish(500, "DishNameOne", "DishNameOneDescription"));
        internetOrder.add(new Drink(190, "DrinkNameOne", "DrinkNameOneDescription"));
        String address = "Moscow, Pushkina street, Kolotushkina";
        try {
            orderManager1.add(internetOrder, address);
        } catch (OrderException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Arrays.toString(internetOrder.getMenu()));
    }
}

