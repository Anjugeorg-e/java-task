package instagramtask;

import java.time.LocalDate;

public class Reel extends Content {

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

    public void setView(Profile profileViewingTheReel) {
        views += 1;
    }

    public boolean uploadReel() {
        for (Reel reel : this.getProfile().reels) {
            if (reel.getContentId() == this.getContentId()) {
                return false;
            }
        }
        this.getProfile().reels.add(this);
        this.getProfile().incrementCountOfContents();
        for (Profile profile : this.getProfile().following) {
            profile.getFeed().reels.add(this);

        }
        return true;
    }

    @Override
    public String toString() {
        return "Reel [ Profile=" + super.getProfile().getprofileName() + ", videoUrl=" + videoUrl + ", caption="
                + super.getCaption() + ", ContentId=" + super.getContentId() + ", views=" + views + ", likes="
                + super.getLikes() + ", tags=" + this.getTags() + ", comments=" + super.getComments() + ",postedDate="
                + super.getPostedDate() + "]";
    }
}
