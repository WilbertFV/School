public class Part3 {

  public static void main(String[] args) {

    /*******************************************************************************
     * Kean University
     * Semester (FALL 2023)
     * Course: CPS*2231*07 - Computer Programming
     * Author(s): Wilbert Villalobos CPS2231*07
     * Homework 2
     * Program Description:
     * -Group assignment task 3
     *************************************************************************/

    // Declare, Create, and Initialize a 2D array
    int[][] matrix = {
        { 10, 15, 20, 25 },
        { 30, 35, 40, 45 },
        { 50, 55, 60, 65 }
    };

    // =====================================================================

    // Print the values in the form of a table/matrix.
    System.out.println("Matrix Content:");
    printMatrix(matrix);

    // =====================================================================

    // Print content of odd columns only in the form of a table/matrix
    System.out.println("Odd Columns Content:");
    printOddColumns(matrix);

    // =====================================================================

    // Find a maximum element considering only odd columns
    int maxInOddColumns = findMaxInOddColumns(matrix);
    System.out.println("Maximum element in odd columns: " + maxInOddColumns);
  }

  // =====================================================================
  // Methods needed: printMatrix(),printOddColumns(), findMaxInOddColumns()
  // =====================================================================

  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int num : row) {
        System.out.printf("%4d", num);
      }
      System.out.println();
    }
  }

  // =====================================================================

  public static void printOddColumns(int[][] matrix) {
    for (int[] row : matrix) {
      for (int j = 1; j < row.length; j += 2) {
        System.out.printf("%4d", row[j]);
      }
      System.out.println();
    }
  }

  // =====================================================================

  public static int findMaxInOddColumns(int[][] matrix) {
    int max = Integer.MIN_VALUE;
    for (int[] row : matrix) {
      for (int j = 1; j < row.length; j += 2) {
        if (row[j] > max) {
          max = row[j];
        }
      }
    }
    return max;
  }
}
