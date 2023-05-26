package examination;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String studentName;
    private int age;
    private int correctAnswerCount;
    ArrayList<Integer> enteredAnswers = new ArrayList<>();

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

    public void attendExam(QuestionPaper questionPaper) {
        int num = questionPaper.questionList.size();
        for (int i = 0; i < num; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("enter answer for question - " + questionPaper.questionList.get(i) + ": ");
            int num1 = input.nextInt();
            this.enteredAnswers.add(num1);
        }
    }

    public int getCorrectAnswerCount() {
        return correctAnswerCount;
    }

    public void setCorrectAnswerCount(int correctAnswerCount) {
        this.correctAnswerCount = correctAnswerCount;
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", age=" + age + "]";
    }

}
