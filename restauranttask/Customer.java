package restauranttask;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private int age;
    private String address;
    private String phoneNumber;
    ArrayList<Order> orderList = new ArrayList<>();

    public Customer(String customerName, int age, String address, String phoneNumber) {
        this.customerName = customerName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addFoodToCart(Menu menu, FoodCart cart, SelectedItem items) {
        if (items.getItem().getCategory() == "veg" && menu.vegList.contains(items.getItem())) {
            cart.selectedItems.add(items);
        } else if (items.getItem().getCategory() == "nonveg" && menu.nonVegList.contains(items.getItem())) {
            cart.selectedItems.add(items);
        } else {
            System.out.println("item is not available");
        }
    }

    public Order orderItem(Restaurant restaurant, FoodCart cart) {
        Order order = new Order();
        order.orderedItemList.add(cart);
        order.setOrderStatus("ordered");
        order.setTotalPrice(cart.getTotalPrice());
        this.orderList.add(order);
        restaurant.orders.add(order);
        return order;
    }

    @Override
    public String toString() {
        return "Customer [customerName=" + customerName + ", age=" + age + ", address=" + address + ", phoneNumber="
                + phoneNumber + "]";
    }

}
