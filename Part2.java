import java.util.Random;

public class Part2 {

  public static void main(String[] args) {

    /*******************************************************************************
     * Kean University
     * Semester (FALL 2023)
     * Course: CPS*2231*07 - Computer Programming
     * Author(s): Wilbert Villalobos CPS2231*07
     * Homework 2
     * Program Description:
     * -Group assignment task 2
     *************************************************************************/

    // Declare dimensions and create a matrix

    int rows = 3;
    int cols = 4;
    int[][] matrix = new int[rows][cols];
    System.out.println("Matrix Dimensions: " + rows + " rows, " + cols + " columns");

    // =============================================================================================

    // Populating matrix with random numbers and printing

    Random rand = new Random();
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = rand.nextInt(50); // Populate matrix with random numbers between 0 and 99
      }
    }
    System.out.println("Matrix Content:");
    printMatrix(matrix);

    // =============================================================================================

    // Creating a ragged/ jagged array and printing
    int[][] jaggedArray = {
        { 1, 2, 3, 4 },
        { 5, 6 },
        { 7, 8, 9 }
    };
    System.out.println("Jagged Array Content:");
    printMatrix(jaggedArray);
  }

  // =============================================================================================

  // Method to print matrix content
  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int num : row) {
        System.out.printf("%4d", num);
      }
      System.out.println();
    }
  }
}
