package instagramtask;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CommentTest {
    @Test
    public void testSetComment() {
        Instagram instagram = new Instagram();
        User Anu = new User("anu_james", "anu@1234", "anujames@gmail.com");
        Anu.createProfile("anu_james", "own rules", "https://anuprofile.png", instagram);
        Comment comment = new Comment(Anu.getProfile(), "wow!!");
        assertEquals("wow!!", comment.getComment());

        comment.setComment("beautiful!!");
        assertEquals("beautiful!!", comment.getComment());
    }
}
