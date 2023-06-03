package instagramtask;

public class User {
    private String userName;
    private String password;
    private String email;
    private Profile profile;

    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean createProfile(String profileName, String bio, String ProfilePictureurl, Instagram instagram) {
        for(Profile profile: instagram.instagramAccounts){
            if(profile.getProfileName() == profileName){
                return false;
            }
        }
        this.profile = new Profile(profileName, bio, ProfilePictureurl,this);
        instagram.instagramAccounts.add(profile);
        return true;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", password=" + password + ", email=" + email + "]";
    }
}
