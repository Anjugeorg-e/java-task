package instagramtask;

import java.time.LocalDate;
import java.util.ArrayList;

public class Content {
    private Profile Profile;
    private String caption;
    private int contentid;
    private int likes;
    private Instagram instagram;
    private LocalDate postedDate;
    ArrayList<Profile> likesDidByProfiles = new ArrayList<>();
    ArrayList<Comment> comments = new ArrayList<>();

    public Content(String caption, Profile profile, int contentid, LocalDate postedDate) {
        this.caption = caption;
        Profile = profile;
        this.contentid = contentid;
        this.postedDate = postedDate;
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

    public int getContentId() {
        return contentid;
    }

    public void setId(int contentid) {
        this.contentid = contentid;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes() {
        likes++;
    }

    public ArrayList<Profile> likesDidByProfiles() {
        return likesDidByProfiles;
    }

    public void setlikesDidByProfiles(Profile profile) {
        this.likesDidByProfiles.add(profile);
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(Comment comment) {
        this.comments.add(comment);
    }

    public LocalDate getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(LocalDate postedDate) {
        this.postedDate = postedDate;
    }

    @Override
    public String toString() {
        return "Content [Profile=" + Profile.getProfileName() + ", caption=" + caption + ", contentid=" + contentid
                + ", likes=" + likes + ", comments=" + comments + "]";
    }
}
