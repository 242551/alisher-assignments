// Main.java
public class Main {
    public static void main(String[] args) {
        // Create MenuItem instances
        MenuItem samsa = new MenuItem("Samsa", 350.00, "Zakuski");
        MenuItem meat= new MenuItem("meat po french", 1200.00, "Main Course");
        MenuItem coke = new MenuItem("Coke", 400.00, "Drinks");

        // Create an Order instance
        Order order1 = new Order(1);
        order1.addItem(samsa);
        order1.addItem(coke);

        Order order2 = new Order(2);
        order2.addItem(meat);

        // Create a Restaurant instance
        Restaurant restaurant = new Restaurant("Ote damdi", "Astana IT University");

        // Display restaurant details
        restaurant.displayRestaurant();

        // Display orders
        System.out.println("\n--- Order 1 Details ---");
        order1.displayOrder();

        System.out.println("\n--- Order 2 Details ---");
        order2.displayOrder();

        // Compare total amounts of two orders
        System.out.println("\nComparing Orders:");
        if (order1.getTotalAmount() > order2.getTotalAmount()) {
            System.out.println("Order 1 has a higher total amount.");
        } else if (order1.getTotalAmount() < order2.getTotalAmount()) {
            System.out.println("Order 2 has a higher total amount.");
        } else {
            System.out.println("Both orders have the same total amount.");
        }
    }
}
