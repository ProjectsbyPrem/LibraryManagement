import java.util.ArrayList;
import java.util.List;

/**
 * Created by asee2278 on 2/15/17.
 */
public class LibraryManager {

    List<Student> studentlist = new ArrayList<Student>();



    public Student registerStudent(String studentName){
        Student student =   new Student(studentName);
        student.setStudentId(studentlist.size());
        addStudent( student);
        return student;
    }


    void addStudent(Student student){
        studentlist.add(student.getStudentId(),student);
    }



}
