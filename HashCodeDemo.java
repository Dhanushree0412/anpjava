package day18;
import java.util.HashSet;
public class HashCodeDemo {

	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<>();

	        set.add("Babu");
	        set.add("Anil");
	        set.add("Deepak");
	        set.add("Anu");
	        set.add("Akshu");

	        for (String name : set) {
	            System.out.println(name);
	            System.out.println(name.hashCode());

	}

}
}
