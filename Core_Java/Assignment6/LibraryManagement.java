// LibraryManagement.java
import java.util.*;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String id,String title,String author){
        this.itemId = id; this.title = title; this.author = author;
    }
    public String getItemId(){ return itemId; }
    public String getTitle(){ return title; }
    public String getAuthor(){ return author; }

    public abstract int getLoanDuration(); // days
    public void getItemDetails(){
        System.out.println(itemId + ": " + title + " by " + author + " (loan " + getLoanDuration() + " days)");
    }
}

interface Reservable {
    boolean reserveItem(String userId);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    public Book(String id,String title,String author){ super(id,title,author); }
    public int getLoanDuration(){ return 21; }
    public boolean reserveItem(String userId){ if(available){ available=false; return true;} return false; }
    public boolean checkAvailability(){ return available; }
}

class Magazine extends LibraryItem {
    public Magazine(String id,String title,String author){ super(id,title,author); }
    public int getLoanDuration(){ return 7; }
}

class DVD extends LibraryItem {
    public DVD(String id,String title,String author){ super(id,title,author); }
    public int getLoanDuration(){ return 3; }
}

public class LibraryManagement {
    public static void main(String[] args){
        List<LibraryItem> items = Arrays.asList(new Book("B1","Java Basics","X"), new Magazine("M1","Tech Today","Y"), new DVD("D1","Movie","Z"));
        for(LibraryItem it: items) it.getItemDetails();
    }
}
