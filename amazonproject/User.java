package amazonproject;

import java.util.ArrayList;

public class User {

    private String Name;
    private int age;
    private String gender;
    ArrayList<Account> userAccounts = new ArrayList<>();
    ArrayList<Product> orderList = new ArrayList<>();

    public User(String name, int age, String gender) {
        Name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 10) {
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<Product> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Product> orderList) {
        this.orderList = orderList;
    }

    public boolean createUseruserAccount(String username, String password, Amazon amazon) {
        for (Account acc : amazon.accountList) {
            if (username == acc.getUserName() && password == acc.getPassword()) {
                return false;
            }
        }
        Account userAcc = new Account(username, password);
        userAccounts.add(userAcc);
        amazon.accountList.add(userAcc);
        return true;
    }

    public boolean findProduct(Product product, Amazon amazon) {
        if (amazon.productList.contains(product)) {
            return true;
        }
        return false;
    }

    public boolean addProductToCart(Product product, Cart cart, Amazon amazon) {
        if (amazon.productList.contains(product)) {
            cart.productsInCart.add(product);
            return true;
        }
        return false;
    }

    public boolean placeOrder(Cart cart) {
        boolean placed = false;
        if (cart.productsInCart.isEmpty()) {
            placed = false;
        } else {
            Order order = new Order();
            order.setPurchasedProductList(cart.productsInCart);
            this.setOrderList(cart.productsInCart);
            order.setTotalPrice(cart.getTotalPrice());
            order.setOrderStatus("order placed");
            placed = true;
        }
        return placed;
    }

    @Override
    public String toString() {
        return "User [Name=" + Name + ", age=" + age + ", gender=" + gender + "]";
    }

}
