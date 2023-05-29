package restauranttask;

import java.util.ArrayList;

public class Menu {

    ArrayList<Item> nonVegList = new ArrayList<>();
    ArrayList<Item> vegList = new ArrayList<>();

    public Menu() {
    }

    public void addItemToVegList(Item item) {
        if (item.getCategory() == "veg") {
            vegList.add(item);
        }
    }

    public void addItemToNonVegList(Item item) {
        if (item.getCategory() == "nonveg") {
            nonVegList.add(item);
        }
    }

    @Override
    public String toString() {
        return "Menu [nonVegList=" + nonVegList + ", vegList=" + vegList + "]";
    }

}
