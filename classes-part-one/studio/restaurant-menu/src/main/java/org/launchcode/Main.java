package org.launchcode;

public class Main {

    public static void main(String[] args) {

        Menu1 menu = new Menu1();

        MenuItem1 item1 = new MenuItem1(9.99, "Caesar Salad", "Appetizer");
        MenuItem1 item2 = new MenuItem1(14.99, "Spaghetti Carbonara", "Main Course");
        MenuItem1 item3 = new MenuItem1(7.99, "Affogato", "Dessert");

        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);

        menu.showMenuItems();


    }
}
