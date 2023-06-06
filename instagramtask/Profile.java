package instagramtask;

import java.util.ArrayList;
import java.util.Collections;

public class Profile {

    private String profileName;
    private String bio;
    private String profilePictureUrl;
    private int countOfContents;
    private int followerCount;
    private int followingCount;
    private User user;
    private Feed feed;
    private Inbox inbox;

    ArrayList<Profile> followers = new ArrayList<>();
    ArrayList<Profile> following = new ArrayList<>();
    ArrayList<Post> posts = new ArrayList<>();
    ArrayList<Reel> reels = new ArrayList<>();
    ArrayList<Story> stories = new ArrayList<>();    

    public Profile(String profileName, String bio, String profilePictureurl, User user) {
        this.profileName = profileName;
        this.bio = bio;
        this.profilePictureUrl = profilePictureurl;
        this.user = user;
        this.feed = new Feed(this);
        this.inbox = new Inbox(this);
    }

    public String getprofileName() {
        return profileName;
    }

    public void setprofileName(String profileName) {
        this.profileName = profileName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfilePictureurl() {
        return profilePictureUrl;
    }

    public void setProfilePictureurl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    public int getContentCount() {
        return countOfContents;
    }

    public void setcountOfContents(int countOfContents) {
        this.countOfContents = countOfContents;
    }

    public Inbox getInbox() {
        return inbox;
    }

    public void setInbox(Inbox inbox) {
        this.inbox = inbox;
    }

    public ArrayList<Profile> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Profile> followers) {
        this.followers = followers;
    }

    public ArrayList<Profile> getFollowing() {
        return following;
    }

    public void setFollowing(ArrayList<Profile> following) {
        this.following = following;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public ArrayList<Reel> getReels() {
        return reels;
    }

    public void setReels(ArrayList<Reel> reels) {
        this.reels = reels;
    }

    public ArrayList<Story> getStories() {
        return stories;
    }

    public void setStories(ArrayList<Story> stories) {
        this.stories = stories;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    public boolean follow(Profile instagramProfile) {
        this.following.add(instagramProfile);
        this.followingCount++;
        return true;
    }

    public boolean unfollow(Profile instagramProfile) {
        this.following.remove(instagramProfile);
        this.followingCount--;
        return true;
    }

    public boolean acceptFollowRequest(Profile instagramProfile) {
        this.followers.add(instagramProfile);
        this.followerCount++;
        return true;
    }

    public int getCountOfContents() {
        return countOfContents;
    }

    public void incrementCountOfContents() {
        this.countOfContents = countOfContents+1;
    }

    public void decrementCountOfContents() {
        this.countOfContents = countOfContents-1;
    }


    public Feed getFeed() {
        Collections.sort(this.feed.posts, new contentSorting().reversed());
        Collections.sort(this.feed.reels, new contentSorting().reversed());
        Collections.sort(this.feed.stories, new contentSorting().reversed());
        return this.feed;
    }

    public boolean searchProfile(String userName, Instagram instagram) {
        for (Profile profile : instagram.instagramProfiles) {
            if (profile.getProfileName() == userName) {
                System.out.println("profile:" + profile);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Profile [profileName=" + profileName + ", bio=" + bio + ", profilePictureurl=" + profilePictureUrl
                + ", contentCount=" + countOfContents + ", followerCount=" + followerCount + ", followingCount="
                + followingCount + "]";
    }
}
