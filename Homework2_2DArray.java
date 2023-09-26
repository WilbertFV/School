import java.util.Random;

public class Homework2_2DArray {

    	/*******************************************************************************
	 * Kean University
	 * Semester (FALL 2023)
	 * Course: CPS*2231*07 - Computer Programming
	 * Author(s): Wilbert Villalobos CPS2231*07
	 * Homework 2 
	 * Program Description: 
     * -Create 2D array of random integers 
     * -Create method to find min and max value and return the 2 values
     * -Generate a 2D array with random numbers and apply ^min/max^ method + return
	 *************************************************************************/

    // 1.A) printMartrix(): accepts a 2D int array and prints in table format (printf %4d)
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    //=================================================================
    
    // 1.B) findStats(): process 2D array and determine min/max values. Return 2 values.
    public static int[] findStats(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
        }

        return new int[] { min, max };
    }

    // =================================================================

    // 1. C) Generate a 2D array filled with random numbers and apply methods. 
    public static void main(String[] args) {


        int[][] matrix = new int[5][5];
        Random rand = new Random(); //  

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(50); 
            }
        }

        printMatrix(matrix);
        int[] stats = findStats(matrix);
        System.out.println("Min: " + stats[0]);
        System.out.println("Max: " + stats[1]);
    }
}
