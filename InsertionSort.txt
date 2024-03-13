/*******************************************************************************
 * Kean University- Semester (Spring 2024)
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos CPS2232*02
 * Assignment- Lab 5
 *************************************************************************/

public class InsertionSort {
  public static void insertionSort(int[] list) {
    for (int i = 1; i < list.length; i++) {
      int currentElement = list[i];
      int k;
      for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
        list[k + 1] = list[k];
      }

      list[k + 1] = currentElement;
    }
  }

  public static void main(String[] args) {
    int[] bestCaseList = { 1, 2, 2, 8, 0, 6, 8 };
    long startTimeBest = System.nanoTime();
    insertionSort(bestCaseList);
    long endTimeBest = System.nanoTime();
    System.out.print("Best-case scenario sorted array: ");
    for (int i = 0; i < bestCaseList.length; i++)
      System.out.print(bestCaseList[i] + " ");
    System.out.println("\nBest-case execution time: " + (endTimeBest - startTimeBest) + " nanoseconds");

    int[] worstCaseList = { 8, 6, 0, 8, 2, 2, 1 };
    long startTimeWorst = System.nanoTime();
    insertionSort(worstCaseList);
    long endTimeWorst = System.nanoTime();
    System.out.print("Worst-case scenario sorted array: ");
    for (int i = 0; i < worstCaseList.length; i++)
      System.out.print(worstCaseList[i] + " ");
    System.out.println("\nWorst-case execution time: " + (endTimeWorst - startTimeWorst) + " nanoseconds");
  }
}
