package examination;

public class Examination {
    private int examinationCode;

    public Examination(int examinationCode) {
        this.examinationCode = examinationCode;
    }

    public void conductExam(Student student, QuestionPaper questionPaper, AnswerSheet sheet) {
        student.attendExam(this,questionPaper, sheet);

    }

}
