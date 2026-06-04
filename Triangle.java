package day9;

public class Triangle {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 10; //input
        // Check validity
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid triangle");

            // Type of triangle
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }

            // Check right triangle
            if (a*a + b*b == c*c ||
                a*a + c*c == b*b ||
                b*b + c*c == a*a) {
                System.out.println("Right triangle");
            } else {
                System.out.println("Not a right triangle");
            }

        } else {
            System.out.println("Invalid triangle");
        }
    }
}