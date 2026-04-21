package day3;

public class MarksValidation {

	public static void main(String[] args) {
		int marks = -1;
		
		if(marks<0 && marks>100) {
			System.out.println("Invalid Marks");
		}

		else if (marks >= 81 && marks <= 100) {
		    System.out.println("Distinction");
		} 
		else if (marks >= 60 && marks <= 80) {
		    System.out.println("First Class");
		} 
		else if (marks >= 35 && marks <= 59) {
		    System.out.println("Second Class");
		} 
		else if (marks >= 0 && marks <= 34) {
		    System.out.println("Fail");
		} 
		else {
		    System.out.println("Invalid marks");
		}

	}

}
