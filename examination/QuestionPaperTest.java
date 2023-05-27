package examination;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class QuestionPaperTest {
    @Test
    public void testFindTotalMarkInQuestionPaper() {
        Subject physics = new Subject("physics");
        Question q1 = new Question(4, " SI unit of work and energy?",1);
        q1.setCorrectOption(1);
        q1.setOptions(1, "joule");
        q1.setOptions(2, "watt");
        q1.setOptions(3, "farad");
        q1.setOptions(4, "ohm");

        Question q2 = new Question(4, "charle's law is based on? ",2);
        q2.setCorrectOption(3);
        q2.setOptions(1, "solid");
        q2.setOptions(2, "liquid");
        q2.setOptions(3, "gas");
        q2.setOptions(4, "none of the above");
        QuestionPaper set1 = new QuestionPaper(physics);
        set1.addQuestion(q1);
        set1.addQuestion(q2);

        Double expected = 8.0;
        Double got = set1.findTotalMarkOfQuestionPaper();
        assertEquals(expected, got);

    }

    @Test
    public void testGetSubject() {
        Subject physics = new Subject("physics");
        QuestionPaper set1 = new QuestionPaper(physics);
        assertEquals(physics, set1.getSubject());

    }
}
