package amazonproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {
    @Test
    public void testFindProduct() {
        User anu = new User("anu", 15, "female");
        Amazon amazon = new Amazon();
        Product watch = new Product("watch", 2100, 1);
        amazon.addProductToAmazon(watch);
        assertEquals(true, anu.findProduct(watch, amazon));
        Product camera = new Product("camera", 34000, 1);
        assertEquals(false, anu.findProduct(camera, amazon));
    }

    @Test
    public void testGetAge() {
        User anu = new User("anu", 15, "female");
        assertEquals(15, anu.getAge());
        anu.setAge(16);
        assertEquals(16, anu.getAge());
        anu.setAge(6);
        assertEquals(16, anu.getAge());
    }

    @Test
    public void testGetGender() {
        User anu = new User("anu", 15, "female");
        assertEquals("female", anu.getGender());
        anu.setGender("male");
        assertEquals("male", anu.getGender());
    }

    @Test
    public void testGetName() {
        User anu = new User("anu", 15, "female");
        assertEquals("anu", anu.getName());
        anu.setName("ann");
        assertEquals("ann", anu.getName());
    }

    @Test
    public void testAddProductToCart() {
        User anu = new User("anu", 15, "female");
        Amazon amazon = new Amazon();
        Product watch = new Product("watch", 2100, 1);
        Product perfume = new Product("perfume", 543, 1);
        amazon.addProductToAmazon(watch);
        Cart cart = new Cart();
        assertEquals(true, anu.addProductToCart(watch, cart, amazon));
        assertEquals(false, anu.addProductToCart(perfume, cart, amazon));
    }

    @Test
    public void testPlaceOrder() {
        User anu = new User("anu", 15, "female");
        Amazon amazon = new Amazon();
        Product watch = new Product("watch", 2100, 1);
        amazon.addProductToAmazon(watch);
        Cart cart = new Cart();
        assertEquals(false, anu.placeOrder(cart));
        assertEquals(true, anu.addProductToCart(watch, cart, amazon));
    }

    @Test
    public void testCreateUserAccount() {
        User anu = new User("anu", 15, "female");
        Amazon amazon = new Amazon();
        Product watch = new Product("watch", 2100, 1);
        assertEquals(true, anu.createUseruserAccount("anu", "aug@123", amazon));
        boolean got = anu.createUseruserAccount("anu", "aug@123", amazon);
        assertEquals(false, got);
    }

}
