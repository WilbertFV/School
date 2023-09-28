public class Quiz7_7 {

  /*
   * Pass Array:
   * Write a method named sumArray that takes an array as a parameter and
   * returns the sum of its elements. How would the method be called to find
   * the sum of the array [3, 5, 7, 9, 11]?
   */

  // =======================================================================

  // Method to add the sum of a 1d array
  public static void sumArray(int[] arr) {
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("The sum is: " + sum);
  }

  // =======================================================================

  public static void main(String[] args) {

    int[] arr = { 3, 5, 7, 9, 11 };
    sumArray(arr);

  }
}
