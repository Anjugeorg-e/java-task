package restauranttask;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Restaurant Ittans = new Restaurant("Ittans", menu);

        Customer anu = new Customer("Anu", 23, "ABC(H),edoor", "67809888");
        Customer sam = new Customer("sam", 25, "XYZ(H),payam", "78556778");

        Item chickenNoodles = new Item("chicken Noodles", "nonveg", 230, 1);
        menu.addItemToNonVegList(chickenNoodles);
        Item halfButterChicken = new Item("Butter Chicken", "nonveg", 120, 0.5);
        menu.addItemToNonVegList(halfButterChicken);
        Item fullChilliChicken = new Item("Chilli chicken", "nonveg", 240, 1);
        menu.addItemToNonVegList(fullChilliChicken);
        Item vegNoodles = new Item("veg Noodles", "veg", 160, 1);
        menu.addItemToVegList(vegNoodles);
        Item meals = new Item("meals", "veg", 130, 1);
        menu.addItemToVegList(meals);

        System.out.println("Non Veg items : " + menu.nonVegList);
        System.out.println("Veg items : " + menu.vegList);
        System.out.println("Menu: " + Ittans.getMenu());

        FoodCart anufoodcart = new FoodCart(anu);
        SelectedItem mealsOrder = new SelectedItem(meals, 2, anu);
        SelectedItem noodleOrder = new SelectedItem(chickenNoodles, 1, anu);
        SelectedItem mealsSecondOrder = new SelectedItem(meals, 1, anu);
        anu.addFoodToCart(menu, anufoodcart, noodleOrder);
        anu.addFoodToCart(menu, anufoodcart, mealsOrder);
        anu.addFoodToCart(menu, anufoodcart, mealsSecondOrder);
        anu.orderItem(Ittans, anufoodcart);

        FoodCart samfoodcart = new FoodCart(sam);
        SelectedItem vegNoodlesOrder = new SelectedItem(vegNoodles, 2, sam);
        sam.addFoodToCart(menu, samfoodcart, vegNoodlesOrder);
        sam.orderItem(Ittans, samfoodcart);

        System.out.println("total price in anu's cart: " + anufoodcart.getTotalPrice());
        System.out.println("total price in sam's cart: " + samfoodcart.getTotalPrice());

        System.out.println("Latest orders in restaurant:" + Ittans.orders);

        DeliveryBoy jis = new DeliveryBoy("jis", 12);
        Ittans.assignDeliveryBoyForOrder(anu, jis);
        jis.deliverItem(anu, Ittans);

        System.out.println("Anu: " + anu.orderList);
        System.out.println("sam:" + sam.orderList);
        System.out.println("updated order list :" + Ittans.orders);

    }
}
