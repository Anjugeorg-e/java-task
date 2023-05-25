package amazonproject;

import javax.swing.plaf.nimbus.State;

interface OrderInterface {

    String getOrderStatus();

    double getTotalPrice(Cart cart);

    void getPurchasedProducts();

}
