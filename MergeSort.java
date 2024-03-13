/*******************************************************************************
 * Kean University- Semester (Spring 2024)
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos CPS2232*02
 * Assignment- Lab 5
 *************************************************************************/

public class MergeSort {
  public static void mergeSort(int[] list) {
      if (list.length > 1) {
          int[] firstHalf = new int[list.length / 2];
          System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
          mergeSort(firstHalf);

          int secondHalfLength = list.length - list.length / 2;
          int[] secondHalf = new int[secondHalfLength];
          System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
          mergeSort(secondHalf);

          merge(firstHalf, secondHalf, list);
      }
  }

  public static void merge(int[] list1, int[] list2, int[] temp) {
      int current1 = 0; // Current index in list1
      int current2 = 0; // Current index in list2
      int current3 = 0; // Current index in temp

      while (current1 < list1.length && current2 < list2.length) {
          if (list1[current1] < list2[current2])
              temp[current3++] = list1[current1++];
          else
              temp[current3++] = list2[current2++];
      }

      while (current1 < list1.length)
          temp[current3++] = list1[current1++];

      while (current2 < list2.length)
          temp[current3++] = list2[current2++];
  }

  public static void main(String[] args) {
      int[] list = {1, 2, 2, 8, 0, 6, 8};
      System.out.println("Original array derived from Kean ID:");
      printAndSort(list);

      int[] bestCaseList = {0, 1, 2, 2, 6, 8, 8};
      System.out.println("\nBest-case scenario (already sorted):");
      printAndSort(bestCaseList);

      int[] worstCaseList = {8, 8, 6, 2, 2, 1, 0};
      System.out.println("\nWorst-case scenario (reverse order):");
      printAndSort(worstCaseList);
  }

  private static void printAndSort(int[] list) {
      long startTime = System.nanoTime();
      mergeSort(list);
      long endTime = System.nanoTime();
      for (int i = 0; i < list.length; i++) {
          System.out.print(list[i] + " ");
      }
      System.out.println("\nExecution time: " + (endTime - startTime) + " nanoseconds.");
  }
}
