package instagramtask;

import java.time.LocalDate;
import java.util.ArrayList;

public class Content {
    protected Profile profile;
    protected String caption;
    protected int contentid;
    protected int likes;
    protected String tags;
    protected LocalDate postedDate;
    ArrayList<Profile> likesDidByProfiles = new ArrayList<>();
    ArrayList<Comment> comments = new ArrayList<>();

    public Content(String caption, Profile profile, int contentid, LocalDate postedDate) {
        this.caption = caption;
        this.profile = profile;
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
        return profile;
    }

    public void setProfile(Profile Profile) {
        this.profile = Profile;
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

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
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

    public int getContentid() {
        return contentid;
    }

    public void setContentid(int contentid) {
        this.contentid = contentid;
    }

    public void like(Profile profilewhoIsLikingThePost) {
        this.setLikes();
        this.likesDidByProfiles.add(profilewhoIsLikingThePost);
    }

    public void comment(Profile profilewhoIsCommentingThePost, String comments) {
        Comment comment = new Comment(profilewhoIsCommentingThePost, comments);
        this.setComments(comment);
    }

    public void delete() {
        if (this.profile.posts.contains(this)) {
            this.profile.posts.remove(this);
            this.profile.decrementCountOfContents();
            for (Profile profile : this.getProfile().following) {
                profile.getFeed().posts.remove(this);
            }   
        } else if (this.profile.reels.contains(this)) {
            this.profile.reels.remove(this);
            this.profile.decrementCountOfContents();
            for (Profile profile : this.getProfile().following) {
                profile.getFeed().posts.remove(this);
            }
        }else{
            this.profile.stories.remove(this);
            for (Profile profile : this.getProfile().following) {
                profile.getFeed().stories.remove(this);
            }
        }
    }

    public void editContent(String caption) {
            this.setCaption(caption);
    }

    public boolean share(Profile profileToWhichSharing) {
        profileToWhichSharing.getInbox().contents.add(this);
        return true;
    }

    public void addTag(String tag) {
        this.setTags(tag);
    }

    @Override
    public String toString() {
        return "Content [Profile=" + profile.getProfileName() + ", caption=" + caption + ", contentid=" + contentid
                + ", likes=" + likes + ", comments=" + comments + "]";
    }
}
