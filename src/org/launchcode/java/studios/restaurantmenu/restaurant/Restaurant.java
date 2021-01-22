package org.launchcode.java.studios.restaurantmenu.restaurant;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem edamame = new MenuItem("Edamame", 5, "Steamed and salted soybeans", "Appetizers", false);
        MenuItem ramen = new MenuItem("Ramen", 10, "Thin noodles, vegetables and broth", "Main course", false);
        MenuItem tempura = new MenuItem("Cinnamon Tempura Gelato", 6, "Lightly battered cinnamon-swirl gelato, flash fried and finished with raspberry and chocolate sauces", "Dessert", true);

        Menu menuDishes = new Menu();

        menuDishes.addDish(edamame);
        menuDishes.addDish(ramen);
        menuDishes.addDish(tempura);

        System.out.println(menuDishes.toString());
        System.out.println(edamame.toString());

        menuDishes.removeDish(ramen);
        System.out.println(menuDishes.toString());

    }

}
