
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
        libraryManager.loadInitialData();


        while (repeatRunFlag == 1) {
            System.out.println("Welcome to Library Managment Program ");
//            System.out.println("Here is the available books list ");
//            libraryManager.displayBooks();
            System.out.println("=============================");

            System.out.println("Do you have a student Id ? press 1 for yes and 0 to register ? ");
            loginOption = scan.nextInt();
            if(loginOption == 1 ) {
                System.out.println("Please enter your student Id ");
                studentId = scan.nextInt();
                Student student =null;
                if(studentId > libraryManager.studentlist.size()-1){
                    System.out.println("Please enter valid student id ;-) ");
                    studentId = scan.nextInt();
                }

                try {
                    student = libraryManager.studentlist.get(studentId);
                    System.out.println("Student retrived is " + student);


                    System.out.println("============Books Menus to pick ==============" );
                    System.out.println("Enter 101 for Java books ");
                    System.out.println("Enter 102 for Java books ");
                    System.out.println("Enter 103 for Java books ");
                    System.out.println("============Books Menus to pick ==============");


                    System.out.println("Please enter book Category ");
                    Integer category = scan.nextInt();
                    List<Book> books =  libraryManager.displayBooks(category);

                    // take input for book retival


                    // fetch the book

                    // assign the book (validate its satatus)

                    // acknowldge user


                }catch (Exception e) {
                    System.out.println("Sorry Student cannot be retrived - its invalid student id STUPID ;-)  ");
                }

            }else if (loginOption == 0 ) {
                // create a new user
                System.out.println("Welcome to the Register Screen");
                System.out.println("Enter name of Student ... ");
                String studentName = scan.next();
                Student student = libraryManager.registerStudent(studentName);
                System.out.println("Student registered successfully ");
                System.out.println(student);

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
