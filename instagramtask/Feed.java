package instagramtask;

import java.util.ArrayList;

public class Feed {
    private Profile profile;
    ArrayList<Post>postsOfFollowingProfiles = new ArrayList<>();
    ArrayList<Reel>reelsOfFollowingProfiles = new ArrayList<>();
    ArrayList<Story>storiesOfFollowingProfiles = new ArrayList<>();

    public Feed(Profile profile) {
        this.profile = profile;
    }
    
    public void addContentsToFeed(){
        for(Profile profile: this.profile.following){
            this.postsOfFollowingProfiles.addAll(profile.posts);
            this.reelsOfFollowingProfiles.addAll(profile.reels);
            this.storiesOfFollowingProfiles.addAll(profile.stories);
        }
     }

    @Override
    public String toString() {
        return "Feed [Feed of Profileowner=" + this.profile.getUserName() +  ",posts=" + postsOfFollowingProfiles + ", reels" + reelsOfFollowingProfiles + ", stories="
                + storiesOfFollowingProfiles + "]";
    }    
}
