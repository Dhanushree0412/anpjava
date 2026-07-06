package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Example {
	static void main() {
        //System.out.println("Current version :"+System.getProperty("java.version"));
		Set<String> list= new HashSet<>();
         list.add("Chandra");
         list.add("Deepak");
         list.add("Babu");
         list.add("Anil");
         list.add("Babu");
         list.add("Ammu");
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





























