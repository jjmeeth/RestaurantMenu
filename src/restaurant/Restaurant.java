package restaurant;

public class Restaurant {

    public static void main(String[] args) {
        //Create an instance of Menu
        Menu pizzaMenu = new Menu();

        //Create instances of MenuItems
        MenuItem wings = new MenuItem("Buffalo Wings", 10.00, "One dozen chicken wings fried and tossed in our famous buffalo sauce!", "Appetizer");
        MenuItem spinDip = new MenuItem("Spinach Dip", 7.00, "Spinach and artichoke dip served with flat bread.", "Appetizer");
        MenuItem soup = new MenuItem("French Onion Soup", 4.00, "House recipe soup with crouton and swiss cheese.", "Appetizer");

        MenuItem pizza = new MenuItem("Hawaiian Pizza", 15.00, "16 inch pizza with ham, pineapple, and jalapeños. The best way to eat pizza!", "Main Course");
        MenuItem salad = new MenuItem("Caesar Salad", 10.00, "Classic caesar salad.", "Main Course");
        MenuItem sandwich = new MenuItem("Reuben Sandwich", 10.00, "Rye bread, russian dressing, swiss cheese, corned beef and sauerkraut.", "Main Course");

        MenuItem pie = new MenuItem("Chocolate Pie", 5.00, "Classic chocolate pie with whipped cream.", "Dessert");
        MenuItem cremeBrulee = new MenuItem("Crème Brûlée", 7.00, "Vanilla Crème Brûlée", "Dessert");
        MenuItem milkshake = new MenuItem("Milkshake", 5.00, "20 ounce milkshake with choice of chocolate, vanilla or strawberry flavorings.", "Dessert");

        //Add MenuItems to Menu
        pizzaMenu.addMenuItem(wings);
        pizzaMenu.addMenuItem(spinDip);
        pizzaMenu.addMenuItem(soup);
        
        pizzaMenu.addMenuItem(pizza);
        pizzaMenu.addMenuItem(salad);
        pizzaMenu.addMenuItem(sandwich);

        pizzaMenu.addMenuItem(pie);
        pizzaMenu.addMenuItem(cremeBrulee);
        pizzaMenu.addMenuItem(milkshake);

        //Print the full menu
        System.out.println(pizzaMenu.printFullMenu());

        //Remove a MenuItem and print the full menu
        pizzaMenu.removeMenuItem(milkshake);
        System.out.println(pizzaMenu.printFullMenu());

        pizzaMenu.addMenuItem(wings);

    }
}
