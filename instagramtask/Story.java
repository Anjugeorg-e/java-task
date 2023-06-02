package instagramtask;

public class Story{

    private Profile profile;
    private String storyType;
    private String caption;
    
    public Story(Profile profile, String storyType, String caption) {
        this.profile = profile;
        this.storyType = storyType;
        this.caption = caption;
    }

    @Override
    public String toString() {
        return "Story [profile=" + profile.getUserName() + ", storyType=" + storyType + ", caption=" + caption + "]";
    }

}
