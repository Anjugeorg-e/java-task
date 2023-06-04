package instagramtask;

import java.util.ArrayList;
import java.util.HashMap;

public class Inbox {
    private Profile profile;
    ArrayList<Post> receivedPosts = new ArrayList<>();
    HashMap<Profile, Post>receivedpost = new HashMap<Profile, Post>();
    ArrayList<Reel> receivedReels = new ArrayList<>();

    public Inbox(Profile profile) {
        this.profile = profile;
    }

    public ArrayList<Post> getReceivedPosts() {
        return receivedPosts;
    }

    public void setReceivedPosts(ArrayList<Post> receivedPosts) {
        this.receivedPosts = receivedPosts;
    }

    public ArrayList<Reel> getReceivedReels() {
        return receivedReels;
    }

    public void setReceivedReels(ArrayList<Reel> receivedReels) {
        this.receivedReels = receivedReels;
    }

    public HashMap<Profile, Post> getReceivedpost() {
        return receivedpost;
    }

    public void setReceivedpost(Profile profile, Post post) {
        this.receivedpost.put(profile, post);
    }   

    @Override
    public String toString() {
        return "Inbox [profile=" + profile.getProfileName() + ", receivedPosts=" + receivedPosts + ", receivedReels=" + receivedReels
                + "]";
    }

}
