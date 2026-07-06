package lab5;

public class PrimeProgram {
	// Function to check whether a number is prime
    static boolean isPrime(int n) {

        // Numbers less than or equal to 1 are not prime
        if (n <= 1)
            return false;

        // Check divisibility from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // Function to print prime numbers in a range
    static void primesInRange(int start, int end) {

        // Check each number in the range
        for (int i = start; i <= end; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // Function to print prime factors
    static void primeFactorization(int n) {

        // Start checking from 2
        for (int i = 2; i <= n; i++) {

            // Print factor until it no longer divides n
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Test isPrime()
        System.out.println(isPrime(17));
        System.out.println(isPrime(4));

        // Test primesInRange()
        primesInRange(1, 20);

        // Test primeFactorization()
        primeFactorization(12);
        primeFactorization(100);
    }
}
