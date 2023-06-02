package instagramtask;

import java.util.ArrayList;

public class Content {
    private String caption;
    private Profile Profile;
    private int id;
    private int likes;
    ArrayList<Profile> likedProfiles = new ArrayList<>();
    ArrayList<Comment>comments = new ArrayList<>();

    public Content(String caption, instagramtask.Profile profile, int id) {
        this.caption = caption;
        Profile = profile;
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Profile getProfile() {
        return Profile;
    }

    public void setProfile(Profile Profile) {
        this.Profile = Profile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes() {
        likes++;
    }

    public ArrayList<Profile> getLikedProfiles() {
        return likedProfiles;
    }

    public void setLikedProfiles(Profile profile) {
        this.likedProfiles.add(profile);
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(Comment comment) {
        this.comments.add(comment);
    }

    @Override
    public String toString() {
        return "Content [caption=" + caption + ", Profile=" + Profile.getUserName() + ", itemId=" + id + ", likes="
                + likes
                + ", comments=" + comments + "]";
    }
}
