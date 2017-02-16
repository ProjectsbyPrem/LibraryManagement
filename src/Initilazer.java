import java.util.ArrayList;
import java.util.List;

/**
 * Created by asee2278 on 2/15/17.
 */
public class Initilazer {

    public List<Student> loadStudents() {
        List<Student> studentlist = new ArrayList<Student>();

        studentlist.add(new Student(0,"Naren"));
        studentlist.add(new Student(1,"Sphoorthi"));
        studentlist.add(new Student(2,"Mohan"));
        studentlist.add(new Student(3,"Brigdish"));


        return studentlist;
    }

    /**
     * Created by asee2278 on 2/15/17.
     */
    public class Initilizer {

        public Initilizer(LibraryManager libraryManager) {

        }
    }

}
