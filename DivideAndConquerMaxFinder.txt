/*******************************************************************************
 * Kean University- Spring 2024
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos
 * HW 4
 *************************************************************************/
public class DivideAndConquerMaxFinder {
  public static int findMax(int[] array, int left, int right) {
      if (left == right) {
          return array[left];
      }
      int mid = left + (right - left) / 2;
      int maxLeft = findMax(array, left, mid);
      int maxRight = findMax(array, mid + 1, right);
      return Math.max(maxLeft, maxRight);
  }
}
