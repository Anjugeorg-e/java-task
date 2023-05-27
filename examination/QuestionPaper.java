package examination;

import java.util.ArrayList;

public class QuestionPaper {
    private double totalMark;
    private Subject subject;
    ArrayList<Question> questionList = new ArrayList<>();

    public QuestionPaper(Subject subject) {
        this.subject = subject;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }

    public void addQuestion(Question question) {
        questionList.add(question);
    }

    public void removeQuestion(Question question) {
        questionList.remove(question);
    }

    public double findTotalMarkOfQuestionPaper() {
        double total = 0;
        for (int i = 0; i < questionList.size(); i++) {
            total += questionList.get(i).getMarkforCorrectAnswer();
        }
        this.setTotalMark(total);
        return this.getTotalMark();
    }

    @Override
    public String toString() {
        return "QuestionPaper [totalMark=" + totalMark + ", subject=" + subject + "]";
    }

   

}
