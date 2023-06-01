package restauranttask;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private String address;
    private String phoneNumber;
    private FoodCart cart;
    ArrayList<Order> orderList = new ArrayList<>();

    public Customer(String customerName, String address, String phoneNumber) {
        this.customerName = customerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.cart = new FoodCart(this);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public FoodCart getCart() {
        return cart;
    }

    public void setCart(FoodCart cart) {
        this.cart = cart;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Order createOrder(Restaurant restaurant) {
        Order order = new Order(this);
        order.selectedItems = this.cart.selectedItems;
        order.setOrderStatus(orderStatus.ORDER_PLACED.getValue());
        this.orderList.add(order);
        restaurant.orders.add(order);
        return order;
    }

    @Override
    public String toString() {
        return "Customer [customerName=" + customerName + ", address=" + address + ", phoneNumber="
                + phoneNumber + "]";
    }
}
