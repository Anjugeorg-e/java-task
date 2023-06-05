package instagramtask;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class ReelTest {
    @Test
    public void testSetVideoUrl() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu123", "anujames@gmail.com");
        Anu.createProfile("anu_james", "blissfull", "https://hjhuu.png", instagram);
        Reel reel = new Reel("https://car.mp4", "car race", Anu.getProfile() , 0, LocalDate.of(2023, 06, 04));
        assertEquals("https://car.mp4", reel.getVideoUrl());

        reel.setVideoUrl("https://bike.mp4");
        assertEquals("https://bike.mp4", reel.getVideoUrl());

    }

}
