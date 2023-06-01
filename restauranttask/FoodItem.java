package restauranttask;

enum Portion {
    HALF("half"),
    FULL("full"),
    QUARTER("quarter");

    private String value;

    private Portion(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public class FoodItem {
    private String name;
    private boolean isVeg;
    private double price;

    private String portion;

    public FoodItem(String name, boolean isVeg, double price, String portion) {
        this.name = name;
        this.isVeg = isVeg;
        this.price = price;
        this.portion = portion;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FoodItem [name=" + name + ", isVeg=" + isVeg + ", price=" + price + ", portion=" + portion + "]";
    }
}
