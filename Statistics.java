package lab5;

public class Statistics {
	// Method to find the minimum number
    static int findMin(int[] a) {

        // Assume first element is the smallest
        int min = a[0];

        // Check the remaining elements
        for (int i = 1; i < a.length; i++) {

            // If current element is smaller than min
            if (a[i] < min)

                // Update minimum value
                min = a[i];
        }

        // Return the minimum value
        return min;
    }

    // Method to find the maximum number
    static int findMax(int[] a) {

        // Assume first element is the largest
        int max = a[0];

        // Check the remaining elements
        for (int i = 1; i < a.length; i++) {

            // If current element is greater than max
            if (a[i] > max)

                // Update maximum value
                max = a[i];
        }

        // Return the maximum value
        return max;
    }

    // Method to find the average
    static double findMean(int[] a) {

        // Variable to store total
        int sum = 0;

        // Add all elements
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        // Return average
        return (double) sum / a.length;
    }

    // Method to find the median
    static double findMedian(int[] a) {

        // Bubble sort to arrange numbers in ascending order
        for (int i = 0; i < a.length - 1; i++) {

            // Compare adjacent elements
            for (int j = 0; j < a.length - 1 - i; j++) {

                // Swap if left element is greater
                if (a[j] > a[j + 1]) {

                    // Temporary variable for swapping
                    int temp = a[j];

                    // Swap the values
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // Check if number of elements is even
        if (a.length % 2 == 0) {

            // Return average of middle two elements
            return (a[a.length / 2] + a[a.length / 2 - 1]) / 2.0;
        }

        // If odd, return the middle element
        return a[a.length / 2];
    }

    // Main method starts here
    public static void main(String[] args) {

        // Store the numbers in an array
        int[] numbers = {5, 3, 8, 1, 9};

        // Print minimum value
        System.out.println("Min = " + findMin(numbers));

        // Print maximum value
        System.out.println("Max = " + findMax(numbers));

        // Print mean value
        System.out.println("Mean = " + findMean(numbers));

        // Print median value
        System.out.println("Median = " + findMedian(numbers));
    }
}

