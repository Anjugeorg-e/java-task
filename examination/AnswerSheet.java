package examination;

import java.util.HashMap;

public class AnswerSheet {
    private Student student;
    private QuestionPaper questionPaper;
    private double obtainedScore;
    private int correctAnswerCount;
    private Examination examination;
    HashMap<Integer, Integer> optionsChosenByStudent = new HashMap<Integer, Integer>();

    public AnswerSheet(Student student, QuestionPaper questionPaper, Examination examination) {
        this.student = student;
        this.questionPaper = questionPaper;
        this.examination = examination;
    }

    public void setoptionschosenByStudent(int questionNum, Integer option) {
        this.optionsChosenByStudent.put(questionNum, option);
    }

    public HashMap<Integer, Integer> getOptionsChosenByStudent() {
        return optionsChosenByStudent;
    }

    public int getCorrectAnswerCount() {
        return correctAnswerCount;
    }

    public void setCorrectAnswerCount(int correctAnswerCount) {
        this.correctAnswerCount = correctAnswerCount;
    }

    public double resultCalculation() {
        int correctAnswerCount = 0;
        double score = 0;
        for (Question question : questionPaper.questionList) {
            if (this.optionsChosenByStudent.containsKey(question.getQuestionNumber())) {
                if (question.getCorrectOption() == this.optionsChosenByStudent.get(question.getQuestionNumber())) {
                    correctAnswerCount += 1;
                    score = score + question.getMarkforCorrectAnswer();
                } else {
                    score = score - 1;
                }
            }
        }
        this.setCorrectAnswerCount(correctAnswerCount);
        this.setObtainedScore(score);
        return score;
    }

    public double getObtainedScore() {
        return obtainedScore;
    }

    public void setObtainedScore(double obtainedScore) {
        this.obtainedScore = obtainedScore;
    }

    public String toString() {
        return "AnswerSheet [student=" + student + ", questionPaper=" + questionPaper + ", obtainedScore="
                + obtainedScore + ", correctAnswerCount=" + correctAnswerCount + ", examination=" + examination + "]";
    }

}
