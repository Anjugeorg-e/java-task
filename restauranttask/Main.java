package restauranttask;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Restaurant Ittans = new Restaurant("Ittans", menu);

        Customer anu = new Customer("Anu", "ABC(H)", "67809888");
        Customer sam = new Customer("sam", "Agh(H)", "678966964");

        FoodItem chickenNoodles = new FoodItem("Chicken Noodles", false, 290,Portion.FULL.getValue());
        menu.addItemToMenu(chickenNoodles);
        FoodItem halfButterChicken = new FoodItem("Butter Chicken", false, 130,Portion.HALF.getValue()  );
        menu.addItemToMenu(halfButterChicken);
        FoodItem chilliChicken = new FoodItem("Chilli chicken", false, 240, Portion.FULL.getValue());
        menu.addItemToMenu(chilliChicken);
        FoodItem vegNoodles = new FoodItem("veg Noodles", true, 160, Portion.HALF.getValue());
        menu.addItemToMenu(vegNoodles);
        FoodItem meals = new FoodItem("meals", true, 130, Portion.FULL.getValue());
        menu.addItemToMenu(meals);        

        System.out.println("Ittans menu: " +menu);
        
        anu.getCart().addItemToCart(meals, 2, menu);
        anu.getCart().addItemToCart(chickenNoodles, 1, menu);
        anu.createOrder(Ittans);
        System.out.println("order list of anu : " +anu.orderList);
        System.out.println(" ");

        sam.getCart().addItemToCart(meals, 1, menu);
        sam.getCart().addItemToCart(vegNoodles, 2, menu);
        sam.createOrder(Ittans);

        System.out.println("order list of sam : " +sam.orderList);
        System.out.println(" ");
        
        System.out.println("Ittans orders: " + Ittans.orders);
        
    }
}
