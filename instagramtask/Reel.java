package instagramtask;

public class Reel extends Content{

    private String videoUrl;
    private int views;

    public Reel(String videoUrl, String caption, Profile Profile, int id) {
        super(caption, Profile, id);
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setView(){
        views ++;
    }

    @Override
    public String toString() {
        return "Reel [ Profile=" + super.getProfile().getUserName() + ", videoUrl=" + videoUrl +  ", content=" + super.getCaption() + ", itemId=" +super.getId()+  ", views=" + views + ", likes=" + super.getLikes()+ ", comments=" +super.getComments()+ "]";
    }
}
