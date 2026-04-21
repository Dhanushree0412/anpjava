package day9;

public class HollowDiamond {

	public static void main(String[] args) {
		//upper part
		for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3 - i; j++) { //spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { //stars printing
                if (k == 1 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println(); //next line
        }

        // Lower part
        for (int i = 3 - 1; i >= 1; i--) {
        	
            for (int j = 1; j <= 3 - i; j++) { //spaces
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) { //stars printing
                if (k == 1 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();// next line
        }
    }
}