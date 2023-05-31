package restauranttask;

import java.util.ArrayList;

public class Restaurant {
    private String restaurantName;
    private Menu menu;
    ArrayList<Order> orders = new ArrayList<>();

    public Restaurant(String restaurantName, Menu menu) {
        this.restaurantName = restaurantName;
        this.menu = menu;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void assignDeliveryBoyForOrder(Customer customer, DeliveryBoy name) {
        if (!customer.orderList.isEmpty()) {
            for (Order order : customer.orderList) {
                order.setDeliveryBoy(name);
            }
        }
    }

    @Override
    public String toString() {
        return "Restaurant [restaurantName=" + restaurantName + ", menu=" + menu + "]";
    }

}
