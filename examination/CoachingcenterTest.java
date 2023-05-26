package examination;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CoachingcenterTest {
    @Test
    public void testAddStudentToCoachingCenter() {
        Coachingcenter alpha = new Coachingcenter("alpha");
        Student anu = new Student("anu", 23);
        assertEquals(true, alpha.addStudentToCoachingCenter(anu));
    }

    @Test
    public void testAddSubjectToCoachingCenter() {
        Coachingcenter alpha = new Coachingcenter("alpha");
        Subject physics = new Subject("physics");
        assertEquals(true, alpha.addSubjectToCoachingCenter(physics));
    }

    @Test
    public void testGetCoachingCenterName() {
        Coachingcenter alpha = new Coachingcenter("alpha");
        alpha.setCoachingCenterName("gamma");
        String got = alpha.getCoachingCenterName();
        String expected = "gamma";
        assertEquals(expected, got);
    }

}
