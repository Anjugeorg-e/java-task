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
        Story anusstory = new Story(Anu.getProfile(), "https://environment.png", "environment", LocalDate.of(2023, 06, 05), 2);
        assertEquals("environment", anusstory.getCaption());

        anusstory.setCaption("environment day");
        assertEquals("environment day", anusstory.getCaption());
    }

    @Test
    public void testSetCreatedDate() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Story anusstory = new Story(Anu.getProfile(), "https://environment.png", "environment", LocalDate.of(2023, 06, 05), 2);
        assertEquals(LocalDate.of(2023, 06, 05), anusstory.getCreatedDate());

        anusstory.setCreatedDate(LocalDate.of(2023, 06, 06));
        assertEquals(LocalDate.of(2023, 06, 06), anusstory.getCreatedDate());
    }

    @Test
    public void testSetStoryId() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Story anusstory = new Story(Anu.getProfile(), "https://environment.png", "environment", LocalDate.of(2023, 06, 05), 2);
        assertEquals(2, anusstory.getStoryId());

        anusstory.setStoryId(5);
        assertEquals(5, anusstory.getStoryId());
    }

    @Test
    public void testSetcontentUrl() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Story anusstory = new Story(Anu.getProfile(), "https://environment.png", "environment", LocalDate.of(2023, 06, 05), 2);
        assertEquals("https://environment.png", anusstory.getcontentUrl());
    }
}
