package examination;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                Coachingcenter alpha = new Coachingcenter("alpha");
                Student anu = new Student("anu", 23);
                Student sam = new Student("sam", 26);
                Subject chemistry = new Subject("chemistry");
                Subject physics = new Subject("physics");

                alpha.addStudentToCoachingCenter(sam);
                alpha.addStudentToCoachingCenter(anu);
                alpha.addSubjectToCoachingCenter(physics);
                alpha.addSubjectToCoachingCenter(chemistry);

                Question q1 = new Question(4, " SI unit of work and energy?", 1);
                q1.setOptions(1, "joule");
                q1.setOptions(2, "watt");
                q1.setOptions(3, "farad");
                q1.setOptions(4, "ohm");
                q1.setCorrectOption(1);

                Question q2 = new Question(4, "charle's law is based on? ", 2);
                q2.setOptions(1, "solid");
                q2.setOptions(2, "liquid");
                q2.setOptions(3, "gas");
                q2.setOptions(4, "none of the above");
                q2.setCorrectOption(3);

                Question q3 = new Question(4, "ball pen function in the principal of? ", 3);
                q3.setOptions(1, "viscocity");
                q3.setOptions(2, "gravity");
                q3.setOptions(3, "capilarity");
                q3.setOptions(4, "atmospheric pressure");
                q3.setCorrectOption(2);

                Question q4 = new Question(4, "x-rays cannot pass through what?", 4);
                q4.setOptions(1, "skin");
                q4.setOptions(2, "bone");
                q4.setOptions(3, "meat");
                q4.setOptions(4, "wood");
                q4.setCorrectOption(2);

                QuestionPaper set1 = new QuestionPaper(physics);
                set1.addQuestion(q1);
                set1.addQuestion(q2);
                set1.addQuestion(q3);
                set1.addQuestion(q4);
                System.out.println("Total marks in set1: " + set1.findTotalMarkOfQuestionPaper());

                Examination exam = new Examination(234);
                AnswerSheet scoreCard = new AnswerSheet(sam, set1, exam);

                exam.conductExam(sam, set1, scoreCard);
                scoreCard.resultCalculation();
                System.out.println("correct answers count: " + scoreCard.getCorrectAnswerCount());

                alpha.addNewResult(scoreCard);
                System.out.println(alpha.examResults);

        }
}
