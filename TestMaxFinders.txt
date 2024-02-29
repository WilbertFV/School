/*******************************************************************************
 * Kean University- Spring 2024
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos
 * HW 4
 *************************************************************************/
public class TestMaxFinders {
  public static void main(String[] args) {
      int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10, 11, 13, 15, 14, 12};

      long startTime = System.nanoTime();
      int maxNaive = NaiveMaxFinder.findMax(array);
      long endTime = System.nanoTime();
      System.out.println("Naive Max: " + maxNaive + ", Time: " + (endTime - startTime) + " ns");

      startTime = System.nanoTime();
      int maxDivideConquer = DivideAndConquerMaxFinder.findMax(array, 0, array.length - 1);
      endTime = System.nanoTime();
      System.out.println("Divide and Conquer Max: " + maxDivideConquer + ", Time: " + (endTime - startTime) + " ns");
  }
}
