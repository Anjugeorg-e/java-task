package instagramtask;

import java.util.ArrayList;

public class Feed {
    private Profile profile;
    ArrayList<Post> posts = new ArrayList<>();
    ArrayList<Reel> reels = new ArrayList<>();
    ArrayList<Story> stories = new ArrayList<>();

    public Feed(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Feed [profile=" + profile.getprofileName() + ", posts=" + posts + ", reels=" + reels + ", stories=" + stories + "]";
    }

}
