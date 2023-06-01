package restauranttask;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Restaurant Ittans = new Restaurant("Ittans", menu);

        Customer anu = new Customer("Anu", 23, "ABC(H),edoor", "67809888");
        Customer sam = new Customer("sam", 25, "XYZ(H),payam", "78556778");

        FoodItem chickenNoodles = new FoodItem("Chicken Noodles",false, 290, "full");
        menu.addItemToMenu(chickenNoodles);
        FoodItem halfButterChicken = new FoodItem("Butter Chicken", false, 130, "half");
        menu.addItemToMenu(halfButterChicken);
        FoodItem fullChilliChicken = new FoodItem("Chilli chicken", false, 240, "full");
        menu.addItemToMenu(fullChilliChicken);
        FoodItem vegNoodles = new FoodItem("veg Noodles", true, 160, "full");
        menu.addItemToMenu(vegNoodles);
        FoodItem meals = new FoodItem("meals", true, 130, "full");
        menu.addItemToMenu(meals);

        
        FoodCart anufoodcart = new FoodCart(anu);

        OrderItem mealsOrder = new OrderItem(meals, 2);
        OrderItem noodleOrder = new OrderItem(chickenNoodles, 1);
    
        anu.orderItem(menu, mealsOrder, Ittans);
        anu.orderItem(menu, noodleOrder, Ittans);
        
        
        
        // OrderItem mealsSecondOrder = new OrderItem(meals, 1, anu);
        // anu.addFoodToCart(menu, anufoodcart, noodleOrder);
        // anu.addFoodToCart(menu, anufoodcart, mealsOrder);
        // anu.addFoodToCart(menu, anufoodcart, mealsSecondOrder);
        // anu.orderItem(Ittans, anufoodcart);
        
        // FoodCart samfoodcart = new FoodCart(sam);
        // OrderItem vegNoodlesOrder = new OrderItem(vegNoodles, 2, sam);
        // sam.addFoodToCart(menu, samfoodcart, vegNoodlesOrder);
        // sam.orderItem(Ittans, samfoodcart);

        // System.out.println("total price in anu's cart: " + anufoodcart.getTotalPrice());
        // System.out.println("total price in sam's cart: " + samfoodcart.getTotalPrice());

        // System.out.println("Latest orders in restaurant:" + Ittans.orders);

        
        System.out.println("Menu: " + Ittans.getMenu());
        System.out.println("Anu: " + anu.orderList);
        
        System.out.println("updated order list :" + Ittans.orders);

        
    }
}
