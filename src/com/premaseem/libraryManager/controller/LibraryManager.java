package com.premaseem.libraryManager.controller;

import com.premaseem.libraryManager.domainObjects.Book;
import com.premaseem.libraryManager.domainObjects.Student;

import java.util.*;

/**
 * Created by asee2278 on 2/15/17.
 */
public class LibraryManager {

    public List<Student> studentlist = new ArrayList<Student>();
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


    public List<Book> displayBooks(Integer categoryId){
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

    /**
     * Created by asee2278 on 2/15/17.
     */
    public static class Initilazer {

        public List<Student> loadStudents(List<Student> studentlist) {

            studentlist.add(new Student(0,"System user"));
            studentlist.add(new Student(1,"Sphoorthi"));
            studentlist.add(new Student(2,"Mohan"));
            studentlist.add(new Student(3,"Brigdish"));
            studentlist.add(new Student(4,"Naren"));

            return studentlist;
        }


        public void loadBooks(Map<Integer, List<Book>> simulatedHashMap){
            new Book( "Let us Java", "Yashwant Kanetkar", 101, 0).feed(simulatedHashMap);

            new Book( "Bile of java", "Yashwant Kanetkar", 101, 1).feed(simulatedHashMap);


            new Book( "From 0 to Hero in Java", "Yashwant Kanetkar", 101, 2).feed(simulatedHashMap);


            new Book( "Let us Javascript", "Yashwant Kanetkar", 102, 0).feed(simulatedHashMap);


            new Book( "Bile of javascript", "Yashwant Kanetkar", 102, 1).feed(simulatedHashMap);


            new Book( "Let us Go", "Yashwant Kanetkar", 103, 0).feed(simulatedHashMap);


            new Book( "Bile of Golang", "Yashwant Kanetkar", 103, 8).feed(simulatedHashMap);


            new Book( "From 0 to Hero in javascript", "Yashwant Kanetkar", 102, 8).feed(simulatedHashMap);
        }


        /**
         * Created by asee2278 on 2/15/17.
         */
        public class Initilizer {


        }

    }
}
