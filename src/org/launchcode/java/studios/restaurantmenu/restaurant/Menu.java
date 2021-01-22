package org.launchcode.java.studios.restaurantmenu.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> listOfDishes;
    private Date lastUpdated;

    public Menu() {
        this.listOfDishes = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public void addDish(MenuItem dishName) {
        if (!listOfDishes.contains(dishName)) {
            listOfDishes.add(dishName);
            this.lastUpdated = new Date();
        } else {
            System.out.println("This dish is already on the menu, don't forget it!");
        }
    }

    public void removeDish(MenuItem dishName) {
        listOfDishes.remove(dishName);
        this.lastUpdated = new Date();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "listOfDishes=" + listOfDishes +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
