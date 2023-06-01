package restauranttask;

enum orderStatus {

    ORDER_PLACED("ordered"),
    ORDER_DELIVERED("order delivered");

    private String value;

    private orderStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public class Order extends PurchaseCart {

    private String statusOfOrder;

    public Order(Customer customer) {
        super(customer);

    }

    public String getOrderStatus() {
        return statusOfOrder;
    }

    public void setOrderStatus(String statusOfOrder) {
        this.statusOfOrder = statusOfOrder;
    }

    @Override
    public String toString() {
        return "Order [orderStatus=" + statusOfOrder + ", totalPrice=" + this.getTotalPrice() + ", customer="
                + this.getCustomer() + "selectedItems=" + this.getSelectedItems() + "]";
    }
}
