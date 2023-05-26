package examination;

import java.util.ArrayList;

public class QuestionPaper {
    private double totlMark;
    private Subject subject;
    ArrayList<Question> questionList = new ArrayList<>();

    public QuestionPaper(Subject subject) {
        this.subject = subject;
    }

    public double getTotlMark() {
        return totlMark;
    }

    public void setTotlMark(double totlMark) {
        this.totlMark = totlMark;
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

    public double findTotalMarkInQuestionPaper() {
        double total = 0;
        for (int i = 0; i < questionList.size(); i++) {
            total += questionList.get(i).getMarkforCorrectAnswer();
        }
        this.setTotlMark(total);
        return this.getTotlMark();
    }

}
