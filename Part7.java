import java.util.Random;

public class Part7 {

  public static void main(String[] args) {

    /*******************************************************************************
     * Kean University
     * Semester (FALL 2023)
     * Course: CPS*2231*07 - Computer Programming
     * Author(s): Wilbert Villalobos CPS2231*07
     * Homework 2
     * Program Description:
     * -Group assignment task 7
     *************************************************************************/

    // Create a 4D array with dimensions 2x2x2x2
    int[][][][] fourDArray = new int[2][2][2][2];

    Random rand = new Random();

    // Populate it with random numbers, print the array to console
    populateArray(fourDArray, rand);
    System.out.println("4D Array 1 Content:");
    printFourDArray(fourDArray);

    // Create and populate a 4D array with dimensions 3x3x3x3
    int[][][][] fourDArray2 = new int[3][3][3][3];
    populateArray(fourDArray2, rand);

    // Add 2 to all even numbers, add 1 to all odd numbers in your array
    modifyArray(fourDArray2);

    // Print the output
    System.out.println("Updated 4D Array 2 Content:");
    printFourDArray(fourDArray2);
  }

  // ===============================================================================================

  // Populate the 4D array with random numbers
  public static void populateArray(int[][][][] array, Random rand) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        for (int k = 0; k < array[i][j].length; k++) {
          for (int l = 0; l < array[i][j][k].length; l++) {
            array[i][j][k][l] = rand.nextInt(50);
          }
        }
      }
    }
  }

  // ===============================================================================================

  // Add 2 to all even numbers and add 1 to all odd numbers
  public static void modifyArray(int[][][][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        for (int k = 0; k < array[i][j].length; k++) {
          for (int l = 0; l < array[i][j][k].length; l++) {
            if (array[i][j][k][l] % 2 == 0) {
              array[i][j][k][l] += 2;
            } else {
              array[i][j][k][l] += 1;
            }
          }
        }
      }
    }
  }

  // ===============================================================================================

  // Print and format a 4D array
  public static void printFourDArray(int[][][][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        for (int k = 0; k < array[i][j].length; k++) {
          for (int l = 0; l < array[i][j][k].length; l++) {
            System.out.printf("%4d", array[i][j][k][l]);
          }
          System.out.println();
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
