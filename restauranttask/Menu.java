package restauranttask;

import java.util.ArrayList;

public class Menu {

    ArrayList<FoodItem> foodItems = new ArrayList<>();

    public void addItemToMenu(FoodItem item) {
        foodItems.add(item);
    }

    @Override
    public String toString() {
        return "Menu [foodItems=" + foodItems + "]";
    }

    
   
}
