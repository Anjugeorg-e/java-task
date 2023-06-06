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

    public boolean uploadStory() {
        for (Story story : this.getProfile().stories) {
            if (story.getContentId() == this.getContentId()) {
                return false;
            }
        }
        LocalDate dateAfter1day = this.postedDate.plusDays(1);
        this.getProfile().stories.add(this);
        for (Profile profile : this.getProfile().following) {
            profile.getFeed().stories.add(this);
        }
        if (LocalDate.now().compareTo(dateAfter1day) == 0) {
            this.getProfile().stories.remove(this);
            for (Profile profile : this.getProfile().following) {
                profile.getFeed().stories.remove(this);
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Story [ Profile=" + super.getProfile().getprofileName() + ",  caption=" + super.getCaption()
                + ", contentId=" + super.getContentId() + ",postedDate= " + super.getPostedDate() + "]";
    }
}
