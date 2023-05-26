package examination;

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

                Question q1 = new Question(4, " SI unit of work and energy?");
                q1.setCorrectOption(1);
                q1.setOptions(1, "joule");
                q1.setOptions(2, "watt");
                q1.setOptions(3, "farad");
                q1.setOptions(4, "ohm");

                Question q2 = new Question(4, "charle's law is based on? ");
                q2.setCorrectOption(3);
                q2.setOptions(1, "solid");
                q2.setOptions(2, "liquid");
                q2.setOptions(3, "gas");
                q2.setOptions(4, "none of the above");

                Question q3 = new Question(4, "ball pen function in the principal of? ");
                q3.setCorrectOption(2);
                q3.setOptions(1, "viscocity");
                q3.setOptions(2, "gravity");
                q3.setOptions(3, "capilarity");
                q3.setOptions(4, "atmospheric pressure");

                QuestionPaper set1 = new QuestionPaper(physics);
                set1.addQuestion(q1);
                set1.addQuestion(q2);
                set1.addQuestion(q3);

                Examination exam = new Examination();
                set1.findTotalMarkInQuestionPaper();
                System.out.println("Total marks in set1: " + set1.getTotlMark());

                System.out.println("score in set1: "+exam.conductExam(sam, set1));
                System.out.println("correct answers count: " + sam.getCorrectAnswerCount());

        }
}
