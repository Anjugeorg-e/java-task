package instagramtask;

import java.time.LocalDate;

public class Story {

    private Profile profile;
    private String contentUrl;
    private String caption;
    private LocalDate createdDate;
    private int storyId;

    public Story(Profile profile, String contentUrl, String caption, LocalDate date, int storyId) {
        this.profile = profile;
        this.contentUrl = contentUrl;
        this.caption = caption;
        this.createdDate = date;
        this.storyId = storyId;
    }

    public String getcontentUrl() {
        return contentUrl;
    }

    public void setcontentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public int getStoryId() {
        return storyId;
    }

    public void setStoryId(int storyId) {
        this.storyId = storyId;
    }

    @Override
    public String toString() {
        return "Story [profile=" + profile + ", contentUrl=" + contentUrl + ", caption=" + caption + ", createdDate="
                + createdDate + ", storyId=" + storyId + "]";
    }
}
