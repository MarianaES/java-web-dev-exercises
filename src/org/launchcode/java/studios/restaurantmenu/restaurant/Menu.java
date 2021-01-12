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
}
