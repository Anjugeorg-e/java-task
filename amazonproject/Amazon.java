package amazonproject;

import java.util.ArrayList;

public class Amazon {
    ArrayList<Account> accountList = new ArrayList<>();
    ArrayList<User> usersList = new ArrayList<>();
    ArrayList<Product> productList = new ArrayList<>();

    public void addNewUser(User user) {
        usersList.add(user);
    }

    public void addProductToAmazon(Product product) {
        productList.add(product);
    }

    public void addAccount(Account account){
        accountList.add(account);
    }
}
