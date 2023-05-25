package amazonproject;

public class Main {
    public static void main(String[] args) {
        User anu = new User("anu", 15, "female");
        Amazon amazon = new Amazon();
        System.out.println("Account cretion status: " + anu.createUseruserAccount("anu", "aug@123", amazon));
        System.out.println("anus account: " + anu.userAccounts);

        Cart anuscart = new Cart();

        Product candy = new Product("candy", 5, 3);
        Product chocolate = new Product("chocolate", 25, 1);
        Product watch = new Product("watch", 5500, 2);
        amazon.productList.add(chocolate);
        amazon.productList.add(candy);
        amazon.productList.add(watch);
        System.out.println("products availble in amazon: " + amazon.productList);

        anu.addProductToCart(candy, anuscart, amazon);
        anu.addProductToCart(chocolate, anuscart, amazon);
        anu.addProductToCart(watch, anuscart, amazon);

        System.out.println("order placed status: " + anu.placeOrder(anuscart));
        System.out.println("orderlist: " + anu.orderList);
        System.out.println("total price from in cart : " + anuscart.getTotalPrice());

        Shippable sh = new Shippable();
        sh.generateTrackingNumberForTheOrder(anu);

        System.out.println("items in anu's cart: " + anuscart.productsInCart);
        System.out.println(anu.createUseruserAccount("annu", "aug@123", amazon));
        anu.createUseruserAccount("ankith", "may@1234", amazon);

        System.out.println(amazon.accountList);

        System.out.println(anuscart.getTotalPrice());

        System.out.println(anuscart.productsInCart);

    }

}
