package day9;

public class HollowTrianglePattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {

          
            for (int j = i; j < 4; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {

                if (i == 4) {
                    System.out.print("*");
                } else {
                    if (k == 1 || k == (2 * i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}