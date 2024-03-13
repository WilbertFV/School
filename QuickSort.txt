/*******************************************************************************
 * Kean University- Semester (Spring 2024)
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos CPS2232*02
 * Assignment- Lab 5
 *************************************************************************/

public class QuickSort {
  public static void quickSort(int[] list) {
    quickSort(list, 0, list.length - 1);
  }

  private static void quickSort(int[] list, int first, int last) {
    if (last > first) {
      int pivotIndex = partition(list, first, last);
      quickSort(list, first, pivotIndex - 1);
      quickSort(list, pivotIndex + 1, last);
    }
  }

  private static int partition(int[] list, int first, int last) {
    int pivot = list[first];
    int low = first + 1;
    int high = last;

    while (high > low) {
      while (low <= high && list[low] <= pivot)
        low++;
      while (low <= high && list[high] > pivot)
        high--;
      if (high > low) {
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
      }
    }

    while (high > first && list[high] >= pivot)
      high--;

    if (pivot > list[high]) {
      list[first] = list[high];
      list[high] = pivot;
      return high;
    } else {
      return first;
    }
  }

  private static void measureAndSort(int[] list) {
    long startTime = System.nanoTime();
    quickSort(list);
    long endTime = System.nanoTime();
    System.out.println("Quick Sort execution time: " + (endTime - startTime) + " nanoseconds.");
  }

  public static void main(String[] args) {
    System.out.println("Best-case scenario array (already sorted):");
    int[] bestCaseList = { 0, 1, 2, 2, 6, 8, 8 };
    measureAndSort(bestCaseList);

    System.out.println("Worst-case scenario array (reverse sorted):");
    int[] worstCaseList = { 8, 8, 6, 2, 2, 1, 0 };
    measureAndSort(worstCaseList);
  }
}
