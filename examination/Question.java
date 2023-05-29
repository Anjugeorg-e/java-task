package examination;

import java.util.HashMap;

public class Question {
    private double markforCorrectAnswer;
    private String question;
    private int correctOption;
    private int questionNumber;
    private Subject subject;
    HashMap<Integer, String> options = new HashMap<Integer, String>();

    public Question(double markforCorrectAnswer, String question, int questionNumber, Subject subject) {
        this.markforCorrectAnswer = markforCorrectAnswer;
        this.question = question;
        this.questionNumber = questionNumber;
        this.subject = subject;
    }

    public double getMarkforCorrectAnswer() {
        return markforCorrectAnswer;
    }

    public void setMarkforCorrectAnswer(double markforCorrectAnswer) {
        this.markforCorrectAnswer = markforCorrectAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getCorrectOption() {
        return correctOption;
    }

    public void setOptions(int OptionNumber, String option) {
        this.options.put(OptionNumber, option);
    }

    public HashMap<Integer, String> getOptions() {
        return options;
    }

    public void setCorrectOption(int option) {
        this.correctOption = option;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    @Override
    public String toString() {
        return "Question [markforCorrectAnswer=" + markforCorrectAnswer + ", question=" + question + ", options="
                + options + "]";
    }

}
