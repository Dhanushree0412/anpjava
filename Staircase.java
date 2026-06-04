package day9;

public class Staircase {

	public static void main(String[] args) {
		int n = 3; // input

        for (int i = 1; i <= n; i++) {

            //to print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // To print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }
}