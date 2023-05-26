package examination;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetAge() {
        Student anu = new Student("anu", 23);
        assertEquals(23, anu.getAge());
    }

    @Test
    public void testGetStudentName() {
        Student ann = new Student("ann", 22);
        assertEquals("ann", ann.getStudentName());
    }

}
