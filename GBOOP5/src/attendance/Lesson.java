package attendance;

import java.util.ArrayList;

public class Lesson {
    private SubjectNames subject;
    private lessonTimes Time;
    private ArrayList<Student> presentStudents=new ArrayList<>();

    public Lesson(SubjectNames theSubject, lessonTimes Time, ArrayList<Student> presentStudents) {
        this.subject = theSubject;
        this.Time = Time;
        this.presentStudents = presentStudents;


    }

    public Lesson(SubjectNames theSubject, lessonTimes Time) {
        this.subject = theSubject;
        this.Time = Time;

    }

    public String toString(){
        StringBuilder temp = new StringBuilder("\n\t"+this.subject.toString()+"\t"+this.Time.toString());
        for (Student e:this.presentStudents){
            temp.append(e.toString()+"\t");
        }
        return temp.toString();
    }
    public void sitStudentIn(Student theStudent){
        this.presentStudents.add(theStudent);
    }

    public SubjectNames getSubject() {
        return subject;
    }

    public void setSubject(SubjectNames subject) {
        this.subject = subject;
    }

    public String getTime() {
        return Time.toString();
    }

    public void setTime(lessonTimes time) {
        Time = time;
    }

    public ArrayList<Student> getPresentStudents() {
        return presentStudents;
    }

    public void setPresentStudents(ArrayList<Student> presentStudents) {
        this.presentStudents = presentStudents;
    }
}

enum SubjectNames {
    MATHS,
    ENGLISH,
    PHISICS,
    PROGRAMMING
}

enum lessonTimes{
    FIRST("10:00"),
    SECOND("11:50"),
    THIRD("13:20");
    private String code;
    lessonTimes(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }

    @Override
    public String toString() {
        return this.code;
    }
}
