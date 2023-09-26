public class Homework2_countEven {

        	/*******************************************************************************
	 * Kean University
	 * Semester (FALL 2023)
	 * Course: CPS*2231*07 - Computer Programming
	 * Author(s): Wilbert Villalobos CPS2231*07
	 * Homework 2 
	 * Program Description: 
     * -Create 3 different versions countEven() method.
     * -Apply overloading methods to provided test cases in main method
	 *************************************************************************/

    // 2.A) Accepts 3 integers as parameters and prints the count of even numbers 

    public static void countEven(int a, int b, int c) {
        int count = 0;
        if (a % 2 == 0) count++;
        if (b % 2 == 0) count++;
        if (c % 2 == 0) count++;
        System.out.println("Count of even numbers: " + count);
    }

    //=======================================================================================

    // 2.B) Accepts a 1D array of int and prints the count of even numbers
    public static void countEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) count++;
        }
        System.out.println("Count of even numbers: " + count);
    }

    //=======================================================================================
    
    // 2.C) Method accepts a 2D array of int and returns count of even numbers

    public static int countEven(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num % 2 == 0) count++;
            }
        }
        return count;
    }

    //=======================================================================================

    // 2.D) Validate each countEven() method with provided test cases:
    public static void main(String[] args) {
        // d) Test cases
        countEven(5, 7, 10);
        countEven(8, 2, 7);
        countEven(new int[]{5, 7, 3, 9, 0});
        countEven(new int[]{2, 6, 4, 8, 1});
        System.out.println("Count of even numbers: " + countEven(new int[][]{{1, 2}, {3, 4, 5}}));
        System.out.println("Count of even numbers: " + countEven(new int[][]{{6, 2}, {3, 4, 0}}));
    }
}
