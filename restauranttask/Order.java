package restauranttask;

enum orderStatus {

    ORDER_PLACED,
    ORDER_DELIVERED
}

public class Order extends PurchaseCart {

    private orderStatus statusOfOrder;

    public Order(Customer customer) {
        super(customer);

    }

    public orderStatus getOrderStatus() {
        return statusOfOrder;
    }

    public void setOrderStatus(orderStatus statusOfOrder) {
        this.statusOfOrder = statusOfOrder;
    }

    @Override
    public String toString() {
        return "Order [orderStatus=" + statusOfOrder + ", totalPrice=" + this.getTotalPrice() + ", customer="
                + this.getCustomer() + "selectedItems=" + this.getSelectedItems() + "]";
    }
}
