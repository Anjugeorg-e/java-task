package examination;

import java.util.ArrayList;

public class Coachingcenter {
    private String coachingCenterName;
    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Subject> subjectList = new ArrayList<>();
    ArrayList<AnswerSheet>examResults = new ArrayList<>();

    public Coachingcenter(String coachingCenterName) {
        this.coachingCenterName = coachingCenterName;
    }

    public String getCoachingCenterName() {
        return coachingCenterName;
    }

    public void setCoachingCenterName(String coachingCenterName) {
        this.coachingCenterName = coachingCenterName;
    }

    public boolean addStudentToCoachingCenter(Student student) {
        studentList.add(student);
        return true;
    }

    public boolean addSubjectToCoachingCenter(Subject subject) {
        subjectList.add(subject);
        return true;
    }

    public void addNewResult(AnswerSheet sheet){
        examResults.add(sheet);
    }

}
