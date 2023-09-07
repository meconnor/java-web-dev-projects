package org.launchcode;

public class MenuItem1 {

    private double price;
    private String description;
    private String category;

    private boolean isNewItem;

    public MenuItem1(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNewItem = true; // By default, when a menu item is created, it's considered new.
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean getIsNewItem() {
        return isNewItem;
    }

    public void setIsNewItem(boolean isNewItem) {
        this.isNewItem = isNewItem;
    }

    @Override
    public String toString() {
        return "Category: " + category + ", Description: " + description + ", Price: $" + price +
                ", New Item: " + (isNewItem ? "Yes" : "No");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        MenuItem1 menuItem = (MenuItem1) obj;

        if (Double.compare(menuItem.price, price) != 0) return false;
        if (isNewItem != menuItem.isNewItem) return false;
        if (!description.equals(menuItem.description)) return false;
        return category.equals(menuItem.category);
    }





}
