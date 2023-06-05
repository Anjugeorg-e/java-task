package instagramtask;

import java.time.LocalDate;

public class Story extends Content {

    private String contentUrl;

    public Story(String caption, Profile profile, int contentid, LocalDate postedDate, String contentUrl) {
        super(caption, profile, contentid, postedDate);
        this.contentUrl = contentUrl;
    }

    public String getcontentUrl() {
        return contentUrl;
    }

    public void setcontentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    @Override
    public String toString() {
        return "Story [ Profile=" + super.getProfile().getprofileName() + ",  caption=" + super.getCaption()
                + ", contentId=" + super.getContentId() + ",postedDate= " + super.getPostedDate() + "]";
    }
}
