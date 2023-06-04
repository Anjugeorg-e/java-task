package instagramtask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Profile {

    private String profileName;
    private String bio;
    private String profilePictureurl;
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
        this.profilePictureurl = profilePictureurl;
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

    public boolean createPost(String imageUrl, String caption, int contentId, LocalDate postedDate) {
        for (Post post : this.posts) {
            if (post.getContentId() == contentId) {
                return false;
            }
        }
        Post newPost = new Post(imageUrl, caption, this, contentId, postedDate);
        this.posts.add(newPost);
        this.countOfContents++;
        return true;
    }

    public void likePost(Profile profile, int id) {
        for (Post post : profile.posts) {
            if (post.getContentId() == id) {
                post.setLikes();
                post.setlikesDidByProfiles(this);
            }
        }
    }

    public void editPost(String caption, int contentId) {
        for (Post post : this.posts) {
            if (post.getContentId() == contentId) {
                post.setCaption(caption);
            }
        }
    }

    public boolean deletePost(int contentId) {
        for (Post post : this.posts) {
            if (post.getContentId() == contentId) {
                this.posts.remove(post);
                return true;
            }
        }
        return false;
    }

    public void commentPost(Profile profile, int id, String comments) {
        for (Post post : profile.posts) {
            if (post.getContentId() == id) {
                Comment comment = new Comment(this, comments);
                post.setComments(comment);
            }
        }
    }

    public boolean addTag(String tag, int contentId) {
        for (Post post : this.posts) {
            if (post.getContentId() == contentId) {
                post.setTags(tag);
                return true;
            }
        }
        return false;
    }

    public boolean createReel(String videoUrl, String caption, int contentId, LocalDate postedDate) {
        for (Reel reel : this.reels) {
            if (reel.getContentId() == contentId) {
                return false;
            }
        }
        Reel reel = new Reel(videoUrl, caption, this, contentId, postedDate);
        this.reels.add(reel);
        this.countOfContents++;
        return true;
    }

    public void likeReel(Profile profile, int id) {
        for (Reel reel : profile.reels) {
            if (reel.getContentId() == id) {
                System.out.println("liked");
                reel.setView();
                reel.setLikes();
                reel.setlikesDidByProfiles(this);
            }
        }
    }

    public void editReel(String caption, int contentId) {
        for (Reel reel : this.reels) {
            if (reel.getContentId() == contentId) {
                reel.setCaption(caption);
            }
        }
    }

    public boolean deleteReel(int contentId) {
        for (Reel reel : this.reels) {
            if (reel.getContentId() == contentId) {
                this.reels.remove(reel);
                return true;
            }
        }
        return false;
    }

    public void commentReel(Profile profile, int id, String comments) {
        for (Reel reel : profile.reels) {
            if (reel.getContentId() == id) {
                Comment comment = new Comment(this, comments);
                reel.setComments(comment);
            }
        }
    }

    public void createStory(String caption, String contentUrl, LocalDate date, int storyId) {
        LocalDate dateAfter1day = date.plusDays(1);
        Story story = new Story(this, caption, contentUrl, date, storyId);
        this.stories.add(story);
        if (LocalDate.now().compareTo(dateAfter1day) == 0) {
            this.stories.remove(story);
        }
    }

    public void deleteStory(int storyId) {
        for (Story story : this.stories) {
            if (story.getStoryId() == storyId) {
                this.stories.remove(story);
            }
        }
    }

    
    // public Feed getFeed() {
    //     Collections.sort(this.feed.postsOfFollowingProfiles, new PostSorting().reversed());
    //     Collections.sort(this.feed.reelsOfFollowingProfiles, new ReelSorting().reversed());
    //     return this.feed;
    // }

    public Feed getFeed() {
        return feed;
    }

    public boolean searchProfile(String userName, Instagram instagram) {
        for (Profile profile : instagram.instagramAccounts) {
            if (profile.getProfileName() == userName) {
                System.out.println("profile:" + profile);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Profile [profileName=" + profileName + ", bio=" + bio + ", profilePictureurl=" + profilePictureurl
                + ", contentCount=" + countOfContents + ", followerCount=" + followerCount + ", followingCount="
                + followingCount + "]";
    }
}
