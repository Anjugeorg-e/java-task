package instagramtask;

import java.time.LocalDate;

public class Post extends Content {

    private String imageUrl;
    private String tags;

    public Post(String imageUrl, String caption, Profile Profile, int contentid, LocalDate postedDate) {
        super(caption, Profile, contentid, postedDate);
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTags() {
        return tags;
    }

    public boolean setTags(String tags) {
        this.tags = tags;
        return true;
    }
    
    @Override
    public String toString() {
        return "Post [ Profile=" + super.getProfile().getprofileName() + ", imageUrl=" + imageUrl+  ", caption=" + super.getCaption() + ", contentId=" +super.getContentId()+ ", likes=" + super.getLikes()+ ", comments=" +super.getComments()+ ", tags=" + this.getTags()+ ", postedDate= " + super.getPostedDate() + "]";
    }
    
}
