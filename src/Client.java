
import java.util.List;
import java.util.Scanner;

/**
 * Created by asee2278 on 2/15/17.
 */
public class Client {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeatRunFlag = 1;
        Integer studentId = 0;
        Integer loginOption = 0;

        LibraryManager libraryManager = new LibraryManager();
        Initilazer initilazer = new Initilazer();
        List<Student> studentList=  initilazer.loadStudents();
        libraryManager.studentlist = studentList;
        

        while (repeatRunFlag == 1) {
            System.out.println("Welcome to Library Managment Program ");
            System.out.println("Do you have a student Id ? press 1 for yes and 0 to register ? ");
            loginOption = scan.nextInt();
            if(loginOption == 1 ) {
                System.out.println("Please enter your student Id ");
                studentId = scan.nextInt();
                // retrive student and go ahead
                Student student = libraryManager.studentlist.get(studentId);
                System.out.println("Student retrived is "+ student);

            }else if (loginOption == 0 ) {
                // create a new user
            } else {
                System.out.println("Invalid entry for Students Module ");
            }




            System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");

            try {
                repeatRunFlag = scan.nextInt();
            } catch (Exception e) {
                repeatRunFlag = 0;
            }


        }
        System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks for Using our program - Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
    }
}
