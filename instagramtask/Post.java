package instagramtask;

import java.time.LocalDate;

public class Post extends Content {

    private String contentUrl;

    public Post(String contentUrl, String caption, Profile Profile, int contentid, LocalDate postedDate) {
        super(caption, Profile, contentid, postedDate);
        this.contentUrl = contentUrl;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public boolean uploadPost() {
        for (Post post : this.getProfile().posts) {
            if (post.getContentId() == this.getContentId()) {
                return false;
            }
        }
        this.getProfile().posts.add(this);
        this.getProfile().incrementCountOfContents();
        for (Profile profile : this.getProfile().following) {
            profile.getFeed().posts.add(this);
        }
        return true;
    }

    @Override
    public String toString() {
        return "Post [ Profile=" + super.getProfile().getprofileName() + ", contentUrl=" + contentUrl + ", caption="
                + super.getCaption() + ", contentId=" + super.getContentId() + ", likes=" + super.getLikes()
                + ", comments=" + super.getComments() + ", tags=" + this.getTags() + ", postedDate= "
                + super.getPostedDate() + "]";
    }
}
