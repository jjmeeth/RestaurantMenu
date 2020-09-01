package restaurant;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private Boolean isNew;

    //make a constructor
    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }

    //Add getters and setters
    public String getName() {return this.name;}

    public double getPrice() {return this.price;}
    public void setPrice(double price) {this.price = price;}

    public String getDescription() {return this.description;}

    public String getCategory() {return this.category;}

    public Boolean getIsNew() {return this.isNew;}

    //add a method to add a statement for new menu items
    public String isNewMenuStatement() {
        String statement = " *** This is a new menu item! *** \n";
        if(isNew) {
            return statement;
        } else {
            return "";
        }
    }

    //create a toString method
    public String toString() {
        return category + " >> " + name + ". Price: $" + price + "\n Description: " + description + " \n" + isNewMenuStatement();
    }

    //create a equals method
    public boolean equals(Object toBeCompared) {

        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        MenuItem theItem = (MenuItem) toBeCompared;
        return theItem.getDescription() == getDescription();
    }


}
