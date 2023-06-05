package instagramtask;

import java.util.ArrayList;

public class Instagram {

    ArrayList<Profile>instagramAccounts = new ArrayList<>();
    ArrayList<User>users = new ArrayList<>();

    public ArrayList<Profile> getInstagramAccounts() {
        return instagramAccounts;
    }

    public void setInstagramAccounts(ArrayList<Profile> instagramAccounts) {
        this.instagramAccounts = instagramAccounts;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
    
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void addUserToInstagram(User user){
        this.users.add(user);
    }
    
    @Override
    public String toString() {
        return "Instagram [instagramAccounts=" + instagramAccounts + "]";
    }
}
