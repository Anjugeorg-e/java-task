package examination;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubjectTest {
    @Test
    public void testGetSubjectName() {
        Subject physics = new Subject("physics");
        assertEquals("physics", physics.getSubjectName());
    }
}
