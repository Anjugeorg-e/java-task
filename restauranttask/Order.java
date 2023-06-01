package restauranttask;

import java.util.ArrayList;

public class Order {
    private String orderStatus;
    private double totalPrice;
    private Customer customer;

    ArrayList<OrderItem> orderedItemList = new ArrayList<>();

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getTotalPrice() {
        double total = 0;
        for (OrderItem item : this.orderedItemList) {
            total += item.getQuantity() * item.getItem().getPrice();
        }
        return total;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ArrayList<OrderItem> getOrderedItemList() {
        return orderedItemList;
    }

    public void setOrderedItemList(ArrayList<OrderItem> orderedItemList) {
        this.orderedItemList = orderedItemList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order [orderStatus=" + orderStatus + ", totalPrice=" + totalPrice + ", customer=" + customer
                + ", orderedItemList=" + orderedItemList + "]";
    }

}
