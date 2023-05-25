package amazonproject;

import java.util.ArrayList;

public class Order implements OrderInterface {

    private String orderStatus;
    private double totalPrice;
    ArrayList<Product> purchasedProductList = new ArrayList<>();

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPurchasedProductList(ArrayList<Product> purchasedProductList) {
        this.purchasedProductList = purchasedProductList;
    }

    @Override
    public void getPurchasedProducts() {
        System.out.println(purchasedProductList);
    }

    @Override
    public String getOrderStatus() {
        return orderStatus;
    }

    @Override
    public double getTotalPrice(Cart cart) {
        return cart.getTotalPrice();
    }

    @Override
    public String toString() {
        return "Order [orderStatus=" + orderStatus + ", totalPrice=" + totalPrice + ", purchasedProductList="
                + purchasedProductList + "]";
    }

}
