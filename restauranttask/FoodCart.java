package restauranttask;

import java.util.ArrayList;

public class FoodCart {
    private Customer customer;
    ArrayList<FoodItem> selectedItems = new ArrayList<>();

    public FoodCart(Customer customer) {
        this.customer = customer;
    }

    public double getTotalPrice() {
        double total = 0;
        for (FoodItem item : this.selectedItems) {
            // total += item.getQuantity() * item.getItem().getPrice() * item.getItem().getPortion();
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "FoodCart [customer=" + customer + ", selectedItem=" + selectedItems + "]";
    }

}
