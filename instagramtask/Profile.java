package instagramtask;

import java.util.ArrayList;

public class Profile {

    private String userName;
    private String fullName;
    private String bio;
    private String profilePictureurl;
    private int contentCount;
    private int followerCount;
    private int followingCount;
    private User user;
    private Feed feed;

    ArrayList<Profile> followers = new ArrayList<>();
    ArrayList<Profile> following = new ArrayList<>();
    ArrayList<Post> posts = new ArrayList<>();
    ArrayList<Reel> reels = new ArrayList<>();
    ArrayList<Story> stories = new ArrayList<>();

    public Profile(String userName, String fullName, String bio, String profilePictureurl, User user) {
        this.userName = userName;
        this.fullName = fullName;
        this.bio = bio;
        this.profilePictureurl = profilePictureurl;
        this.user = user;
        this.feed = new Feed(this);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfilePictureurl() {
        return profilePictureurl;
    }

    public void setProfilePictureurl(String profilePictureurl) {
        this.profilePictureurl = profilePictureurl;
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
        return contentCount;
    }

    public void setContentCount(int contentCount) {
        this.contentCount = contentCount;
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

    public void follow(Profile instagramProfile) {
        this.following.add(instagramProfile);
        this.followingCount++;
    }

    public void unfollow(Profile instagramProfile) {
        this.following.remove(instagramProfile);
        this.followingCount--;
    }

    public boolean acceptRequest(Profile instagramProfile) {
        this.followers.add(instagramProfile);
        this.followerCount++;
        return true;
    }

    public void sendFollowRequest(Profile instagramProfile) {
        instagramProfile.following.add(this);
        instagramProfile.followingCount++;
    }

    public void createPost(String imageUrl, String caption, int contentId) {
        Post newPost = new Post(imageUrl, caption, this, contentId);
        this.posts.add(newPost);
        this.contentCount++;
    }

    public void createReel(String videoUrl, String caption, int contentId) {
        Reel reel = new Reel(videoUrl, caption, this, contentId);
        this.reels.add(reel);
        this.contentCount++;
    }

    public void likeReel(Profile profile, int id) {
        for (Reel reel : profile.reels) {
            reel.setView();
            if (reel.getId() == id) {
                reel.setLikes();
                reel.setLikedProfiles(this);
            }
        }
    }

    public void likePost(Profile profile, int id) {
        for (Post post : profile.posts) {
            if (post.getId() == id) {
                post.setLikes();
                post.setLikedProfiles(this);
            }
        }
    }

    public void commentReel(Profile profile, int id, String comments) {
        for (Reel reel : profile.reels) {
            if (reel.getId() == id) {
                Comment comment = new Comment(this, comments);
                reel.setComments(comment);
            }
        }
    }

    public void commentPost(Profile profile, int id, String comments) {
        for (Post post : profile.posts) {
            if (post.getId() == id) {
                Comment comment = new Comment(this, comments);
                post.setComments(comment);
            }
        }
    }

    public void createStory(String caption, String contentUrl) {
        Story story = new Story(this,caption, contentUrl);
        this.stories.add(story);
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

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    @Override
    public String toString() {
        return "Profile [userName=" + userName + ", bio=" + bio + ", profilePictureurl="
                + profilePictureurl + ", postCount=" + contentCount + ", followerCount=" + followerCount
                + ", followingCount=" + followingCount + "]";
    }
}
