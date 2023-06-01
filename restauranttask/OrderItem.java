package restauranttask;

public class OrderItem {
    private FoodItem item;
    private int quantity;
    
    public OrderItem(FoodItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public FoodItem getItem() {
        return item;
    }

    public void setItem(FoodItem item) {
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
