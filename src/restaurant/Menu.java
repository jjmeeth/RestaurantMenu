package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menu;
    private Date lastUpdated;

   //menu constructor
    public Menu() {
        this.menu = new ArrayList<MenuItem>();
        this.lastUpdated = new Date();
    }

    //method to add an item to the menu
    public String addMenuItem(MenuItem item) {

        if (menu.contains(item)) {
            System.out.println("Alert: " + item.getName() + " is already on the menu.");
        } else {
            menu.add(item);
        }

        return "Menu item has been added.";

    }

    //method to remove an item from the menu
    public void removeMenuItem(MenuItem item) {
        menu.remove(item);
    }

    //method to check to see if an item is new
    public boolean isNew(MenuItem item) {
        return item.getIsNew();
    }

    //method to print the full menu
    public String printFullMenu() {
        String fullMenu = "";

        for (MenuItem item : menu) {
            fullMenu += "-- " + item.toString() + "\n";
        }

        return fullMenu;
    }

   //method to print one item from the menu
    public String printSingleItem(MenuItem item) {
        return item.toString();

    }

    public ArrayList<MenuItem> getMenu() {return menu;}

    public Date getLastUpdated() {return lastUpdated;}

}
