package javafiles;

/**
 * Created by sushi on 15-06-03.
 */
public class Student {

    private int      studentId;
    private String   studentName;

    public Student(int studentId,String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
