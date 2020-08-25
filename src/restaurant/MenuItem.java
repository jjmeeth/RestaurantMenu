package restaurant;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private Boolean newOrNot;

    public MenuItem(String name, double price, String description, String category, Boolean newOrNot) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newOrNot = newOrNot;
    }

    public String getName() {return this.name;}

    public double getPrice() {return this.price;}
    public void setPrice(double price) {this.price = price;}

    public String getDescription() {return this.description;}

    public String getCategory() {return this.category;}

    public Boolean getNewOrNot() {return this.newOrNot;}



}
