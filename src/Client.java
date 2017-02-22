import com.premaseem.libraryManager.controller.LibraryManager;
import com.premaseem.libraryManager.domainObjects.Book;
import com.premaseem.libraryManager.domainObjects.Student;
import com.premaseem.libraryManager.utils.Utils;

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

                    Utils.printBookCatalog();

                    Integer category = scan.nextInt();
                    List<Book> books =  libraryManager.displayBooks(category);
                    System.out.println("Enter the book Id");

                    // take input for book retrival
                    Integer bookId = scan.nextInt();
                    Book book = books.get(bookId);

                    // fetch the book
                    // assign the book (validate its satatus)
                    if(book.isAssigned){
                        System.out.println("sorry book is assgined, come back later");
                    }else{
                        student.assignBook(book);

                    }

                    System.out.println("Do you have to submit a book ? press 1 for yes and 0 for NO ");
                    Integer submit = scan.nextInt();
                    if(submit==1) {

                        Utils.printBookCatalog();

                        category = scan.nextInt();
                        books = libraryManager.displayBooks(category);
                        System.out.println("Enter the book Id");

                        // take input for book retrival
                        bookId = scan.nextInt();
                        book = books.get(bookId);

                        // fetch the book
                        // assign the book (validate its satatus)
                        if (!book.isAssigned) {
                            System.out.println("sorry book is not issued");
                        } else {
                            student.unAssignBook(book);
                            System.out.println("book has been un assigned " + book + " " + student);
                        }
                    }else{
                        System.out.println("Thanks ");
                    }

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
            Utils.printFooter();

    }
}
