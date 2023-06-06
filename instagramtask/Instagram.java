package instagramtask;

import java.util.ArrayList;

public class Instagram {

    ArrayList<Profile>instagramProfiles = new ArrayList<>();
    ArrayList<User>users = new ArrayList<>();

    public ArrayList<Profile> getInstagramAccounts() {
        return instagramProfiles;
    }

    public void setInstagramAccounts(ArrayList<Profile> instagramProfiles) {
        this.instagramProfiles = instagramProfiles;
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
        return "Instagram [instagramProfiles=" + instagramProfiles + "]";
    }
}
