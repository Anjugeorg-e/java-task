package instagramtask;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class StoryTest {
    @Test
    public void testSetCaption() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Story anustory = new Story("environment", Anu.getProfile(), 1, LocalDate.of(2023, 03, 02), "https://hju.png");
        assertEquals("environment", anustory.getCaption());

        anustory.setCaption("environmentt");
        assertEquals("environmentt", anustory.getCaption());
    }

    @Test
    public void testSetCreatedDate() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Story anusstory = new Story("environment", Anu.getProfile(), 1,  LocalDate.of(2023, 06, 05), "https://hju.png");
        assertEquals(LocalDate.of(2023, 06, 05), anusstory.getPostedDate());

        anusstory.setPostedDate(LocalDate.of(2023, 06, 06));
        assertEquals(LocalDate.of(2023, 06, 06), anusstory.getPostedDate());
    }

    @Test
    public void testSetStoryId() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Story anusstory = new Story("environment", Anu.getProfile(), 1,  LocalDate.of(2023, 06, 05), "https://hju.png");
        assertEquals(1, anusstory.getContentId());

        anusstory.setId(5);
        assertEquals(5, anusstory.getContentId());
    }

    @Test
    public void testSetcontentUrl() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Story anusstory = new Story("environment", Anu.getProfile(), 1,  LocalDate.of(2023, 06, 05), "https://environment.png");
        assertEquals("https://environment.png", anusstory.getcontentUrl());

        anusstory.setcontentUrl("https://environmental.png");
        assertEquals("https://environmental.png", anusstory.getcontentUrl());
      }
}
