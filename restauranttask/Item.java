package restauranttask;

public class Item {
    private String foodName;
    private String category;
    private double price;
    private double portion;

    public Item(String foodName, String category, double price, double portion) {
        this.foodName = foodName;
        this.category = category;
        this.price = price;
        this.portion = portion;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPortion() {
        return portion;
    }

    public void setPortion(double portion) {
        this.portion = portion;
    }

    @Override
    public String toString() {
        return "Item [foodName=" + foodName + ", category=" + category + ", price=" + price + "]";
    }

}
