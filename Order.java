
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<MenuItem> items;
    private double totalAmount;

    // Constructor
    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    // Add item to order
    public void addItem(MenuItem item) {
        items.add(item);
        totalAmount += item.getPrice();
    }

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    // Method to display order details
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Items:");
        for (MenuItem item : items) {
            item.displayItem();
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}

