import java.util.*;

/**
 * Created by asee2278 on 2/15/17.
 */
public class LibraryManager {

    List<Student> studentlist = new ArrayList<Student>();
    Map<Integer, List<Book>> simulatedHashMap = new HashMap<Integer, List<Book>>();

    Initilazer initilazer = new Initilazer();


    public void loadInitialData() {
        studentlist = initilazer.loadStudents(studentlist);
        initilazer.loadBooks(simulatedHashMap);
    }

    public Student registerStudent(String studentName){
        Student student =   new Student(studentName);
        student.setStudentId(studentlist.size());
        addStudent( student);
        return student;
    }


    void addStudent(Student student){
        studentlist.add(student.getStudentId(),student);
    }
    List<Book> returnBookList = null;


    List<Book> displayBooks(Integer categoryId){
            System.out.print("Printing books for Category " + categoryId + "\n");
            returnBookList = simulatedHashMap.get(categoryId);
            for (Book b : returnBookList) {
                System.out.println(b);
            }
        return returnBookList;
    }


    void displayBooks(){
        Set<Integer> bookCategories = simulatedHashMap.keySet();

        for (Integer category : bookCategories) {
            System.out.print("Printing books for Category " + category);
            returnBookList = simulatedHashMap.get(category);
            for (Book b : returnBookList) {
                System.out.println(b);
            }
            System.out.println();
        }
    }
}
