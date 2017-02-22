package com.premaseem.libraryManager.domainObjects;
import java.util.ArrayList;
import java.util.List;



/**
 * Created by asee2278 on 2/15/17.
 */

public class Student {

    private Integer studentId=null;
    private String name=null;
    List<Book> books = new ArrayList<Book>(2);


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

    public void assignBook(Book book){
        if(books.size() > 1){
            System.out.println("sorry more then 2 books cannot be assigned");
        }else {
            books.add(book);
            book.isAssigned = true;
            System.out.println("book has been assigned " + book + " " +this );
        }
    }

    public void unAssignBook(Book book){
       books.remove(book);
        book.isAssigned=false;
    }


}
