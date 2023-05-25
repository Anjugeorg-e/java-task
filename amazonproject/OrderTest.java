package amazonproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderTest {
    @Test
    public void testGetOrderStatus() {
        Order order = new Order();
        order.setOrderStatus("placed");
        assertEquals("placed", order.getOrderStatus());
    }

    @Test
    public void testGetTotalPrice() {
        User anu = new User("anu", 15, "female");
        Amazon amazon = new Amazon();
        Product watch = new Product("watch", 2100, 2);
        amazon.addProductToAmazon(watch);
        Cart cart = new Cart();
        anu.addProductToCart(watch, cart, amazon);
        Double expected = 4200.0;
        Double got = cart.getTotalPrice();
        assertEquals(expected, got);

        Product ring = new Product("ring", 120, 3);
        amazon.addProductToAmazon(ring);
        anu.addProductToCart(ring, cart, amazon);
        Double expectedOne = 4560.0;
        Double gotOne = cart.getTotalPrice();
        assertEquals(expectedOne, gotOne);
    }
}
