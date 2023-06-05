package instagramtask;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class PostTest {
    @Test
    public void testSetImageUrl() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Post pOne = new Post("https://environment.png", "environment day", Anu.getProfile(), 2, LocalDate.of(2023,05, 06));
        assertEquals("https://environment.png", pOne.getImageUrl());

        pOne.setImageUrl("https://env.png");
        assertEquals("https://env.png", pOne.getImageUrl());
    }

}
