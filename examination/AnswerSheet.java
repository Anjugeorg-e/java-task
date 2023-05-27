package examination;

import java.util.HashMap;

public class AnswerSheet {
    private Student student;
    private QuestionPaper questionPaper;
    private double scoreData;
    private int correctAnswerCount;
    HashMap<Integer, Integer> answerSheetOfStudent = new HashMap<Integer, Integer>();

    public AnswerSheet(Student student, QuestionPaper questionPaper) {
        this.student = student;
        this.questionPaper = questionPaper;
    }

    public void setAnswerSet(int questionNUm, Integer option) {
        this.answerSheetOfStudent.put(questionNUm, option);
    }

    public HashMap<Integer, Integer> getuserEnteredQuestionAnswerpair() {
        return answerSheetOfStudent;
    }

    public int getCorrectAnswerCount() {
        return correctAnswerCount;
    }

    public void setCorrectAnswerCount(int correctAnswerCount) {
        this.correctAnswerCount = correctAnswerCount;
    }

    public double ResultCalculation() {

        System.out.println(answerSheetOfStudent);
        int correctAnswerCount = 0;
        double score = 0;
        for (Question ques : questionPaper.questionList) {
            if (this.answerSheetOfStudent.containsKey(ques.getQuestionNumber())) {
                if (ques.getCorrectOption() == this.answerSheetOfStudent.get(ques.getQuestionNumber())) {
                    correctAnswerCount += 1;
                    score = score + ques.getMarkforCorrectAnswer();
                } else {
                    score = score - 1;
                }
            }
        }
        this.setCorrectAnswerCount(correctAnswerCount);
        this.setScoreData(score);
        return score;
    }

    public double getScoreData() {
        return scoreData;
    }

    public void setScoreData(double scoreData) {
        this.scoreData = scoreData;
    }

    @Override
    public String toString() {
        return "Valuation [student=" + student + ", questionPaper=" + questionPaper + ", scoreData=" + scoreData + "]";
    }

}
