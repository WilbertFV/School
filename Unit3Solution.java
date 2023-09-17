public class Unit3Solution {

  /*******************************************************************************
   * Kean University
   * Semester (FALL 2023)
   * Course: CPS*2231*07 - Computer Programming
   * Author(s): Wilbert Villalobos CPS2231*07
   * Unit 3 Assignment
   * Program Description: Given any integer, the program displays the minimum
   * value
   *************************************************************************/

  public static void main(String[] args) {

    // Use method to print min
    int minValue = min(8, 5, 8, 22, 1);
    System.out.println("Minimum value: " + minValue);
  }

  // ============================================================================
  
  // Method to find min of any amount of numbers
  public static int min(int... num) {

    int min = num[0];
    for (int i = 0; i < num.length; i++) {
      if (num[i] < min) {
        min = num[i];
      }
    }
    return min;
  }
}
