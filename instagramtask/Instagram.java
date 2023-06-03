package instagramtask;

import java.util.ArrayList;

public class Instagram {

    ArrayList<Profile>instagramAccounts = new ArrayList<>();

    public ArrayList<Profile> getInstagramAccounts() {
        return instagramAccounts;
    }

    public void setInstagramAccounts(ArrayList<Profile> instagramAccounts) {
        this.instagramAccounts = instagramAccounts;
    }

    @Override
    public String toString() {
        return "Instagram [instagramAccounts=" + instagramAccounts + "]";
    }

}
