import java.util.Arrays;

public class Quiz5_7 {

  /*
   * Arrays (1D and 2D):
   * Create a 1D array to store 5 integer values and a 2D array to store the same
   * values in a single row and 5 columns. How would you access the third element
   * in both arrays?
   */

  public static void main(String[] args) {

    // Created 1D array for 5 integers and populate it
    int[] arr = new int[5];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }

    // =========================================================
    
    //Create 2D array and populate it with 1D
    int[][] arr2d = new int[1][5];
    for (int j = 0; j < 5; j++) {
      arr2d[0][j] = arr[j];
    }

    // =========================================================
    
    // Call third element of  1d an 2d
    int third_1D = arr[2];
    int third_2D = arr2d[0][2];

    // =========================================================

    // test it out

    System.out.println("1D array: " + Arrays.toString(arr));
    System.out.println("2D array: " + Arrays.deepToString(arr2d));
    System.out.println("Third element in 1D array: " + third_1D);
    System.out.println("Third element in 2D array: " + third_2D);
  }

}
