package instagramtask;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;


import org.junit.Test;

public class ProfileTest {

    @Test
    public void testFollow() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        User sam = new User("Sam_joe", "sam@111", "sam12@gmail.com");
        sam.createProfile("sam_joe", "...", "https://profile.png", instagram);
        boolean actual = Anu.getProfile().follow(sam.getProfile());
        assertEquals(true, actual);

        assertEquals(1, Anu.getProfile().getFollowingCount());
    }

    @Test
    public void testUnfollow() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        User sam = new User("Sam_joe", "sam@111", "sam12@gmail.com");
        sam.createProfile("sam_joe", "...", "https://profile.png", instagram);
        Anu.getProfile().follow(sam.getProfile());
        boolean actual = Anu.getProfile().unfollow(sam.getProfile());
        assertEquals(true, actual);

        assertEquals(0, Anu.getProfile().getFollowingCount());
    }

    @Test
    public void testAcceptFollowRequest() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        User sam = new User("Sam_joe", "sam@111", "sam12@gmail.com");
        sam.createProfile("sam_joe", "...", "https://profile.png", instagram);
        Anu.getProfile().follow(sam.getProfile());
        boolean actual = sam.getProfile().acceptFollowRequest(Anu.getProfile());
        assertEquals(true, actual);

        assertEquals(1, sam.getProfile().getFollowerCount());
    }

    @Test
    public void testSetProfileName() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        assertEquals("anu_james", Anu.getProfile().getProfileName());

        Anu.getProfile().setProfileName("anu@12jam");
        assertEquals("anu@12jam", Anu.getProfile().getProfileName());
    }


    @Test
    public void testSetcountOfContents() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Reel samreelOne = new Reel("https://car.mp4", "car..//", Anu.getProfile(), 4, LocalDate.of(2023, 05, 05));
        samreelOne.uploadReel();
        assertEquals(1, Anu.getProfile().getContentCount());
    }

    @Test
    public void testSetprofileName() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        assertEquals("anu_james", Anu.getProfile().getProfileName());

        Anu.getProfile().setProfileName("anujame_1");
        assertEquals("anujame_1", Anu.getProfile().getProfileName());
    }

}
