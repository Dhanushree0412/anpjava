package day3;


public class MarriageValidation{
    public static void main(String[] args) {
        String gender = "female";  
        int age = 17;              

        if (gender=="male") {
            if (age >= 21) {
                System.out.println("You are eligible to get married");
            } else {
                System.out.println("You are not eligible to marry, just focus on your career");
            }
        } else if (gender=="female") {
            if (age >= 18) {
                System.out.println("You are eligible to get married");
            } else {
                System.out.println("You are not eligible to marry, just focus on your career");
            }
        } else {
            System.out.println("Invalid gender");
        }
    }
}
