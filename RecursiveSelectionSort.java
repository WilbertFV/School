public class RecursiveSelectionSort {

  public static void recursiveSelectionSort(double[] list, int start) {
      if (start < list.length - 1) {
          // Find the minimum element's index
          int minIndex = start;
          for (int i = start + 1; i < list.length; i++) {
              if (list[i] < list[minIndex]) {
                  minIndex = i;
              }
          }

          // Swap the minimum element with the first element
          double temp = list[start];
          list[start] = list[minIndex];
          list[minIndex] = temp;

          // Recursively sort the remaining array
          recursiveSelectionSort(list, start + 1);
      }
  }

  public static void main(String[] args) {
      double[] list = { 64, 34, 25, 12, 22, 11, 90 }; // Test array
      long startTime = System.nanoTime();
      recursiveSelectionSort(list, 0);
      long endTime = System.nanoTime();

      // Display sorted array and run time
      for (double v : list) {
          System.out.print(v + " ");
      }
      System.out.println("\nRun time (nanoseconds): " + (endTime - startTime));
  }
}
