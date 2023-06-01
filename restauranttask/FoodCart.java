package restauranttask;

public class FoodCart extends PurchaseCart {

    public FoodCart(Customer customer) {
        super(customer);
    }

    public void addItemToCart(FoodItem item, int quantity, Menu menu) {
        if (menu.foodItems.contains(item)) {
            OrderItem itemName = new OrderItem(item, quantity);
            this.selectedItems.add(itemName);
        }
    }

    @Override
    public String toString() {
        return "FoodCart [selectedItem=" + selectedItems + "]";
    }
}
