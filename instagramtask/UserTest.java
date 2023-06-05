package instagramtask;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UserTest {

    @Test
    public void testSetEmail() {
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        assertEquals(Anu.getEmail(), "anujames@gmail.com");

        Anu.setEmail("anujames12@gmail.com");
        assertEquals(Anu.getEmail(), "anujames12@gmail.com");
    }

    @Test
    public void testSetPassword() {
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        assertEquals(Anu.getPassword(), "anu@1234");
        Anu.setPassword("anu2111");
        assertEquals(Anu.getPassword(), "anu2111");
    }

    @Test
    public void testSetUserName() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        instagram.addUserToInstagram(Anu);
        assertEquals(Anu.getUserName(), "anu_james");
        Anu.setUserName("anuzz", instagram);
        assertEquals(Anu.getUserName(), "anuzz");

        User sam = new User("sam_jo", "sam123", "sam@gmail.com");
        boolean actual=  sam.setUserName("anuzz", instagram);
        assertEquals(false, actual);
    }

    @Test
    public void testCreateProfile() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        boolean actual =  Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        assertEquals(true, actual);
    }
}
