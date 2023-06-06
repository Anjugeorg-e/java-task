package instagramtask;

import java.util.ArrayList;

public class Inbox {
    private Profile profile;
    
    ArrayList<Content>contents = new ArrayList<>();

    public Inbox(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Inbox [profile=" + profile.getProfileName() + ", content=" + contents + "]";
    }
}
