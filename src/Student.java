/**
 * Created by asee2278 on 2/15/17.
 */

public class Student {

    private Integer studentId=null;
    private String name=null;

    public Student(Integer studentId ,String name ){
        this.setStudentId(studentId);
        this.setName(name);
    }

    public Student(String name ){
        this.setName(name);
    }


    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Student details: id " +getStudentId() + "  name :  "+ getName() ;
    }
}
