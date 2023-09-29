import java.util.Random;

public class Part4 {

  public static void main(String[] args) {

    /*******************************************************************************
     * Kean University
     * Semester (FALL 2023)
     * Course: CPS*2231*07 - Computer Programming
     * Author(s): Wilbert Villalobos CPS2231*07
     * Homework 2
     * Program Description:
     * -Group assignment task 4
     *************************************************************************/

    // Declare Matrix and apply methods to print
    int[][] matrix = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 }
    };

    System.out.println("Before Shuffling:");
    printMatrix(matrix);

    shuffleArray(matrix);

    System.out.println("After Shuffling:");
    printMatrix(matrix);
  }

  // ===========================================================

  // shuffleArray() with Random
  public static void shuffleArray(int[][] matrix) {
    Random rand = new Random();
    int rows = matrix.length;
    int cols = matrix[0].length;

    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        int randRow = rand.nextInt(rows);
        int randCol = rand.nextInt(cols);

        // Swap elements
        int temp = matrix[row][col];
        matrix[row][col] = matrix[randRow][randCol];
        matrix[randRow][randCol] = temp;
      }
    }
  }

  // ===========================================================

  // printMatrix()
  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}
