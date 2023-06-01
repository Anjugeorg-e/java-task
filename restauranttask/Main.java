package restauranttask;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Restaurant Ittans = new Restaurant("Ittans", menu);

        Customer anu = new Customer("Anu", "ABC(H),edoor", "67809888");
        Customer sam = new Customer("sam", "Agh(H),hj", "678966964");

        FoodItem chickenNoodles = new FoodItem("Chicken Noodles", false, 290, "full");
        menu.addItemToMenu(chickenNoodles);
        FoodItem halfButterChicken = new FoodItem("Butter Chicken", false, 130, "half");
        menu.addItemToMenu(halfButterChicken);
        FoodItem chilliChicken = new FoodItem("Chilli chicken", false, 240, "full");
        menu.addItemToMenu(chilliChicken);
        FoodItem vegNoodles = new FoodItem("veg Noodles", true, 160, "full");
        menu.addItemToMenu(vegNoodles);
        FoodItem meals = new FoodItem("meals", true, 130, "full");
        menu.addItemToMenu(meals);        

        System.out.println("Ittans menu: " +menu);
        
        anu.addItemToCart(meals, 2,menu);
        anu.addItemToCart(chickenNoodles, 1,menu);
        anu.orderItem(Ittans);
        System.out.println("order list of anu : " +anu.orderList);
        System.out.println(" ");

        sam.addItemToCart(meals, 1,menu);
        sam.addItemToCart(vegNoodles, 2,menu);
        sam.orderItem(Ittans);
        System.out.println("order list of sam : " +sam.orderList);
        System.out.println(" ");
        
        System.out.println("Ittans orders: " + Ittans.orders);
        
    }
}
