package instagramtask;

import java.util.ArrayList;

public class Feed {
    private Profile profile;
    ArrayList<Post> postsOfFollowingProfiles = new ArrayList<>();
    ArrayList<Reel> reelsOfFollowingProfiles = new ArrayList<>();
    ArrayList<Story> storiesOfFollowingProfiles = new ArrayList<>();

    public Feed(Profile profile) {
        this.profile = profile;
    }

    public void addContentsToFeed() {
        for (Profile profile : this.profile.following) {
            this.postsOfFollowingProfiles.addAll(profile.posts);
            this.reelsOfFollowingProfiles.addAll(profile.reels);
            this.storiesOfFollowingProfiles.addAll(profile.stories);
        }
    }


    public void sharePost(Profile profileToWhichSharing, int contentId, String userName){
        for(Post post: this.postsOfFollowingProfiles){
            if(post.getContentId() == contentId && post.getProfile().getProfileName() ==userName){
               profileToWhichSharing.getInbox().receivedPosts.add(post);
            }
        }
    }

    public void shareReel(Profile profileToWhichSharing, int contentId){
        for(Reel reel: this.reelsOfFollowingProfiles){
            if(reel.getContentId() == contentId){
               profileToWhichSharing.getInbox().receivedReels.add(reel);
            }
        }
    }


    
    @Override
    public String toString() {
        return "Feed [Feed for profile =" + this.profile.getprofileName() + ",posts=" + postsOfFollowingProfiles
                + ", reels" + reelsOfFollowingProfiles + ", stories="
                + storiesOfFollowingProfiles + "]";
    }
}
