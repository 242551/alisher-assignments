
public class Restaurant {
    private String name;
    private String location;

    // Constructor
    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Method to display restaurant details
    public void displayRestaurant() {
        System.out.println("Restaurant Name: " + name);
        System.out.println("Location: " + location);
    }
}
