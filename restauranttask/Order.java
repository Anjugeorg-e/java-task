package restauranttask;

import java.util.ArrayList;

public class Order {
    private String orderStatus;
    private double totalPrice;
    private DeliveryBoy deliveryBoy;
    ArrayList<FoodCart> orderedItemList = new ArrayList<>();

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ArrayList<FoodCart> getOrderedItemList() {
        return orderedItemList;
    }

    public void setOrderedItemList(ArrayList<FoodCart> orderedItemList) {
        this.orderedItemList = orderedItemList;
    }

    public DeliveryBoy getDeliveryBoy() {
        return deliveryBoy;
    }

    public void setDeliveryBoy(DeliveryBoy deliveryBoy) {
        this.deliveryBoy = deliveryBoy;
    }

    @Override
    public String toString() {
        return "Order [orderStatus=" + orderStatus + ", totalPrice=" + totalPrice + ", orderedItemList="
                + orderedItemList + "]";
    }

}
