package instagramtask;

public class Post extends Content {

    private String imageUrl;

    public Post(String imageUrl, String caption, Profile Profile, int contentid) {
        super(caption, Profile, contentid);
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Post [ Profile=" + super.getProfile().getUserName() + ", imageUrl=" + imageUrl+  ", content=" + super.getCaption() + ", itemId=" +super.getId()+ ", likes=" + super.getLikes()+ ", comments=" +super.getComments()+ "]";
    }
    
}
