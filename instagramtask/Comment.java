package instagramtask;

public class Comment {
    private Profile profile;
    private String comment;

    public Comment(Profile profile, String comment) {
        this.profile = profile;
        this.comment = comment;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    @Override
    public String toString() {
        return "Comment [profile=" + profile.getprofileName() + ", comment=" + comment + "]";
    }
}
