package restauranttask;

import java.util.ArrayList;

public class PurchaseCart {
    private Customer customer;
    ArrayList<OrderItem> selectedItems = new ArrayList<>();

    public PurchaseCart(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<OrderItem> getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(ArrayList<OrderItem> selectedItems) {
        this.selectedItems = selectedItems;
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
        return "Parent [customer=" + customer + ", selectedItems=" + selectedItems + "]";
    }
}
