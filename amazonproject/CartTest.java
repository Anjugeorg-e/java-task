package amazonproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CartTest {
    @Test
    public void testGetTotalPrice() {
        User anu = new User("anu", 23, "female");
        Cart cart = new Cart();
        Amazon amazon = new Amazon();
        Product watch = new Product("watch", 2100, 1);
        Product perfume = new Product("perfume", 543, 2);
        amazon.addProductToAmazon(watch);
        amazon.addProductToAmazon(perfume);
        anu.addProductToCart(perfume, cart, amazon);
        anu.addProductToCart(watch, cart, amazon);
        Double got = cart.getTotalPrice();
        Double expected = 3186.0;
        assertEquals(expected, got);
    }

}
