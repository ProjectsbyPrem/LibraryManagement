/**
 * Created by asee2278 on 2/16/17.
 */
import java.util.*;

public class Book {

    int id, category;
    String name, author;
    Boolean isAssigned;

    public Book(String name, String author, Integer category, int id) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.author = author;
        this.isAssigned = false;
    }

    @Override
    public int hashCode() {
        return category;
    }


    public void feed(Map<Integer, List<Book>> simulatedHashMap) {
        autoCreate(simulatedHashMap);
        simulatedHashMap.get(this.hashCode()).add(this);
    }


    public void autoCreate(Map<Integer, List<Book>> simulatedHashMap){
        if( simulatedHashMap.get(this.hashCode()) == null){
            simulatedHashMap.put(this.hashCode(), new ArrayList<Book>());
        }

    }

    @Override
    public String toString() {
        return " id: " + this.id + " Title: " + this.name + " is Assigned : " + this.isAssigned + " ";
    }
}