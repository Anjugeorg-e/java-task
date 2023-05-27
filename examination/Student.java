package examination;

import java.util.Scanner;

public class Student {
    private String studentName;
    private int age;

    public Student(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void attendExam(Examination examination, QuestionPaper questionPaper, AnswerSheet sheet) {
        int numberOfQuestions = questionPaper.questionList.size();
        for (int i = 0; i < numberOfQuestions; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter answer for question - " + questionPaper.questionList.get(i) + ": ");
            int selectedOption = input.nextInt();
            sheet.setoptionschosenByStudent(questionPaper.questionList.get(i).getQuestionNumber(), selectedOption);
        }
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", age=" + age + "]";
    }

}
