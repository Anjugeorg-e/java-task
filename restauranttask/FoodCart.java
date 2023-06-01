package restauranttask;

import java.util.ArrayList;

public class FoodCart {
    private Customer customer;
    ArrayList<OrderItem>selectedItems = new ArrayList<>();

    public FoodCart(Customer customer) {
        this.customer = customer;
    }

    public double getTotalPrice() {
        double total = 0;
        for (OrderItem item : this.selectedItems) {
            total += item.getQuantity() * item.getItem().getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "FoodCart [selectedItem=" + selectedItems + "]";
    }

}
