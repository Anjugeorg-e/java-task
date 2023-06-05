package instagramtask;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;


import org.junit.Test;

public class ProfileTest {

    @Test
    public void testCreatePost() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        boolean firstTest = Anu.getProfile().createPost("https://environment.png", "environment day", 2, LocalDate.of(2023, 05, 06));
        assertEquals(true, firstTest);

        boolean secondTest = Anu.getProfile().createPost("https://environment.png", "environment day", 2, LocalDate.of(2023, 05, 06));
        assertEquals(false, secondTest);
    }

    @Test
    public void testAddTag() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Anu.getProfile().createPost("https://environment.png", "environment day", 2, LocalDate.of(2023, 05, 06));
        boolean actual = Anu.getProfile().addTag("#env...", 2);
        assertEquals(true, actual);
    }


    @Test
    public void testDeletePost() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Anu.getProfile().createPost("https://environment.png", "environment day", 2, LocalDate.of(2023, 05, 06));
        boolean firstTest = Anu.getProfile().deletePost(2);
        assertEquals(true, firstTest);

        boolean secondTest = Anu.getProfile().deletePost(3);
        assertEquals(false, secondTest);
    }

    @Test
    public void testEditPost() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Anu.getProfile().createPost("https://environment.png", "environment day", 2, LocalDate.of(2023, 05, 06));
        boolean firstTest = Anu.getProfile().editPost("beautiful vibes", 2);
        assertEquals(true, firstTest);

        boolean secondTest = Anu.getProfile().editPost("beauty..", 0);
        assertEquals(false, secondTest);
     }

    @Test
    public void testCreateReel() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        boolean firstTest= Anu.getProfile().createReel("https://car.mp4", "car race", 2, LocalDate.of(2023, 05, 06));
        assertEquals(true, firstTest);

        boolean secondTest = Anu.getProfile().createReel("https://bikw.mp4", "bike race", 2, LocalDate.of(2023, 05, 06));
        assertEquals(false, secondTest);
    }

    @Test
    public void testDeleteReel() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Anu.getProfile().createReel("https://car.mp4", "car race", 2, LocalDate.of(2023, 05, 06));
        boolean firstTest = Anu.getProfile().deleteReel(2);
        assertEquals(true, firstTest);

        boolean secondTest = Anu.getProfile().deleteReel(0);
        assertEquals(false, secondTest);
    }
    
    @Test
    public void testEditReel() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Anu.getProfile().createReel("https://car.mp4", "car race", 2, LocalDate.of(2023, 05, 06));
        boolean firstTest = Anu.getProfile().editReel("car racing!!", 2);
        assertEquals(true, firstTest);

        boolean secondTest = Anu.getProfile().editReel("car racing!!", 1);
        assertEquals(false, secondTest);
    }

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
        Anu.getProfile().createPost("https://img.png", "beauty!!", 1, LocalDate.of(2023, 05, 06));
        assertEquals(1, Anu.getProfile().getContentCount());

        Anu.getProfile().createReel("https://racing.mp4", "car race", 2, LocalDate.of(2023, 06, 05));
        assertEquals(2, Anu.getProfile().getContentCount());
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
