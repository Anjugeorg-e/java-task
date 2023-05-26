package examination;

public class Examination {

    public Examination() {
    }

    public double conductExam(Student student, QuestionPaper questionPaper) {
        int totalQuestionsCount = questionPaper.questionList.size();
        int correctAnswerCount = 0;
        double score = 0;
        student.attendExam(questionPaper);
        for (int i = 0; i < totalQuestionsCount; i++) {
            if (student.enteredAnswers.get(i) == questionPaper.questionList.get(i).getCorrectOption()) {
                correctAnswerCount += 1;
                score = score + questionPaper.questionList.get(i).getMarkforCorrectAnswer();
            } else {
                score = score - 1;
            }
        }
        student.setCorrectAnswerCount(correctAnswerCount);
        return score;
    }
}
