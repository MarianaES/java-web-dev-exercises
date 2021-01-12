package org.launchcode.java.studios.restaurantmenu.restaurant;

public class MenuItem {

    private String dishName;
    private float price;
    private String description;
    private String category;
    private boolean newDish;

    public MenuItem(String dishName, float price, String description, String category, boolean newDish) {
        this.dishName = dishName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newDish = newDish;
    }

    public String getDishName() {
        return this.dishName;
    }

    public float getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCategory() {
        return this.category;
    }

    public boolean getNewDish() {
        return this.newDish;
    }

    public void setDishName(String aDishName) {
        dishName = aDishName;
    }

    public void setPrice(float aPrice) {
        price = aPrice;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public void setNewDish(boolean aNewDish) {
        newDish = aNewDish;
    }

}
