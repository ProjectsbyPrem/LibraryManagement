import java.util.ArrayList;
import java.util.List;

/**
 * Created by asee2278 on 2/15/17.
 */
public class Initilazer {

    public List<Student> loadStudents() {
        List<Student> studentlist = new ArrayList<Student>();

        studentlist.add(new Student(0,"System user"));
        studentlist.add(new Student(1,"Sphoorthi"));
        studentlist.add(new Student(2,"Mohan"));
        studentlist.add(new Student(3,"Brigdish"));
        studentlist.add(new Student(4,"Naren"));

        return studentlist;
    }

    /**
     * Created by asee2278 on 2/15/17.
     */
    public class Initilizer {


    }

}
