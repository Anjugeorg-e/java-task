package instagramtask;

import java.time.LocalDate;

public class Reel extends Content{

    private String videoUrl;
    private int views;

    public Reel(String videoUrl, String caption, Profile Profile, int contentid, LocalDate postedDate) {
        super(caption, Profile, contentid, postedDate);
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

    public void setView(){
        views += 1;
    }

    @Override
    public String toString() {
        return "Reel [ Profile=" + super.getProfile().getprofileName() + ", videoUrl=" + videoUrl +  ", caption=" + super.getCaption() + ", ContentId=" +super.getContentId()+  ", views=" + views + ", likes=" + super.getLikes()+ ", comments=" +super.getComments()+ ",postedDate=" + super.getPostedDate()+"]";
    }
}
