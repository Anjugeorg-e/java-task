package examination;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QuestionTest {
    @Test
    public void testGetCorrectOption() {
        Subject physics = new Subject("physics");
        Question q1 = new Question(4, " SI unit of work and energy?",1,physics);
        q1.setCorrectOption(1);
        q1.setOptions(1, "joule");
        q1.setOptions(2, "watt");
        q1.setOptions(3, "farad");
        q1.setOptions(4, "ohm");

        assertEquals(1, q1.getCorrectOption());
    }

    @Test
    public void testGetMarkforCorrectAnswer() {
        Subject physics = new Subject("physics");
        Question q1 = new Question(4, " SI unit of work and energy?",2,physics);
        Double expected = 4.0;
        Double got = q1.getMarkforCorrectAnswer();
        assertEquals(expected, got);
    }

    @Test
    public void testGetQuestionNumber(){
        Subject physics = new Subject("physics");
        Question q1 = new Question(4, " SI unit of work and energy?",2,physics);
        int expected = 2;
        int got = q1.getQuestionNumber();
        assertEquals(expected, got);
    }
}
