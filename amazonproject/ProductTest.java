package amazonproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductTest {
    @Test
    public void testGetName() {
        Product watch = new Product("watch", 3320, 1);
        watch.setName("titan");
        assertEquals("titan", watch.getName());
    }

    @Test
    public void testGetPrice() {
        Product watch = new Product("watch", 3320, 1);
        watch.setPrice(4330);
        Double expected = 4330.0;
        Double got = watch.getPrice();
        assertEquals(expected, got);
    }

    @Test
    public void testGetQuantity() {
        Product watch = new Product("watch", 3320, 1);
        watch.setQuantity(2);
        int expected = 2;
        int got = watch.getQuantity();
        assertEquals(expected, got);
    }

}
