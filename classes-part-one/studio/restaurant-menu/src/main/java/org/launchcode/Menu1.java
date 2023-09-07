package org.launchcode;

import java.util.*;
import java.util.ArrayList;


public class Menu1 {

     private ArrayList<MenuItem1> items;
     private Date lastUpdated;

     public Menu1() {
          this.items = new ArrayList<>();
          this.lastUpdated = new Date(); // Initialize the lastUpdated date when the menu is created.
     }

     public Date getLastUpdated() {
          return lastUpdated;
     }

     public void setItems(ArrayList<MenuItem1> items) {
          this.items = items;
          this.lastUpdated = new Date(); // Update the lastUpdated date when items are set.
     }

     public ArrayList<MenuItem1> getItems() {
          return items;
     }

     public void addMenuItem(MenuItem1 item) {
          if (!items.contains(item)) {
               items.add(item);
               this.lastUpdated = new Date(); // Update the lastUpdated date when a new item is added.
          } else {
               System.out.println("Warning: This item is already on the menu.");
          }
     }

     public void removeMenuItem(MenuItem1 item) {
          items.remove(item);
          this.lastUpdated = new Date(); // Update the lastUpdated date when an item is removed.
     }

     public void showMenuItems() {
          for (MenuItem1 item : items) {
               System.out.println(item);
          }
     }

}
