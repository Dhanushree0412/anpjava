package lab7;
//Importing ArrayList class
import java.util.ArrayList;

//Main class
public class Lab {

public static void main(String[] args) {

   // Creating an ArrayList to store Book objects
   ArrayList<Book> list = new ArrayList<Book>();

   // Creating Book objects
   Book b1 = new Book(101, "Let Us C", "Yashavant Kanetkar");
   Book b2 = new Book(102, "Head First Java", "Kathy Sierra");

   // Adding objects to ArrayList
   list.add(b1);
   list.add(b2);

   // Advanced for loop to display all book details
   for (Book b : list) {
       System.out.println(b);
   }
}
}

//Book class
class Book {

// Variables
int bookId;
String bookName;
String authorName;

// Parameterized constructor
Book(int bookId, String bookName, String authorName) {

   // Initializing variables
   this.bookId = bookId;
   this.bookName = bookName;
   this.authorName = authorName;
}

// toString() method
public String toString() {

   // Returning book details
   return "Book [bookId=" + bookId +
          ", bookName=" + bookName +
          ", authorName=" + authorName + "]";
}
}

