package day17;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	static void main() {
        //System.out.println("Current version :"+System.getProperty("java.version"));
         ArrayList<String> list = new ArrayList<String>();
         list.add("Chandra");
         list.add("Deepak");
         list.add("Babu");
         list.add("Anil");
         list.add("Babu");
         list.sort(null); 
         list.sort(Collections.reverseOrder());
         System.out.println(list);
         for(String value : list){
             System.out.println(value);
         }

ArrayList<String> students = null;
// size() method
System.out.println("Total Students: " + students.size());

// contains() method
System.out.println("present?" + students.contains("Ravi"));

// remove() method
students.remove(" Ravi ");
    }
}





























