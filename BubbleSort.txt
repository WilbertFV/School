/*******************************************************************************
 * Kean University- Semester (Spring 2024)
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos CPS2232*02
 * Assignment- Lab 5
 *************************************************************************/

public class BubbleSort {
  public static void bubbleSort(int[] list) {
      boolean needNextPass = true;

      for (int k = 1; k < list.length && needNextPass; k++) {
          needNextPass = false;
          for (int i = 0; i < list.length - k; i++) {
              if (list[i] > list[i + 1]) {
                  int temp = list[i];
                  list[i] = list[i + 1];
                  list[i + 1] = temp;

                  needNextPass = true;
              }
          }
      }
  }

  private static void bubbleSortAndPrint(int[] list) {
      long startTime = System.nanoTime();
      bubbleSort(list);
      long endTime = System.nanoTime();
      for (int i = 0; i < list.length; i++) {
          System.out.print(list[i] + " ");
      }
      System.out.println("\nExecution time: " + (endTime - startTime) + " nanoseconds");
  }

  public static void main(String[] args) {
      int[] bestCaseList = {0, 1, 2, 2, 6, 8, 8};
      System.out.println("Best-case scenario:");
      bubbleSortAndPrint(bestCaseList);

      int[] worstCaseList = {8, 8, 6, 2, 2, 1, 0};
      System.out.println("Worst-case scenario:");
      bubbleSortAndPrint(worstCaseList);
  }
}
