package restauranttask;

public class SelectedItem {
    private Item item;
    private int quantity;
    private Customer customer;

    public SelectedItem(Item item, int quantity, Customer customer) {
        this.item = item;
        this.quantity = quantity;
        this.customer = customer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SelectedItem [item=" + item + ", quantity=" + quantity + "]";
    }

}
