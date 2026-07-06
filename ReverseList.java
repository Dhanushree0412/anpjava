package lab7;

//Importing ArrayList class
import java.util.ArrayList;

//Importing Collections class
import java.util.Collections;

//Main class
public class ReverseList {
	public static void main(String[] args) {

        // Creating an ArrayList of String type
        ArrayList<String> list = new ArrayList<String>();

        // Adding elements into the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        // Printing the original list
        System.out.println("Original List: " + list);

        // Reversing the list
        Collections.reverse(list);

        // Printing the reversed list
        System.out.println("Reversed List: " + list);
    }

}
