package restauranttask;

public class FoodItem {
    private String foodName;
    private boolean isVeg;
    private double price;
    private String portion;

    public FoodItem(String foodName, boolean isVeg, double price, String portion) {
        this.foodName = foodName;
        this.isVeg = isVeg;
        this.price = price;
        this.portion = portion;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean isVeg) {
        this.isVeg = isVeg;
    }

    public String getPortion() {
        return portion;
    }

    public void setPortion(String portion) {
        this.portion = portion;
    }

    @Override
    public String toString() {
        return "FoodItem [foodName=" + foodName + ", isVeg=" + isVeg + ", price=" + price + ", portion=" + portion
                + "]";
    }

   

}
