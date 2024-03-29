public class BinarySearch {
  public static int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;

    while (high >= low) {
      int mid = (low + high) / 2;
      if (key < list[mid])
        high = mid - 1;
      else if (key == list[mid])
        return mid; // Key found and returning the index
      else
        low = mid + 1;
    }

    return -low - 1; // Key not found
  }

  public static void main(String[] args) {
    final int N = 50; // Size of the array.
    int[] list = new int[N];
    // Populate and sort the array.
    for (int i = 0; i < N; i++) {
      list[i] = i * 2; // Ensures the array is sorted and has unique values.
    }

    // Best Case: The key is the middle element.
    int bestCaseKey = list[N / 2];
    long bestStartTime = System.nanoTime();
    binarySearch(list, bestCaseKey);
    long bestEndTime = System.nanoTime();

    // Worst Case: The key is not present.
    int worstCaseKey = list[N - 1] + 1;
    long worstStartTime = System.nanoTime();
    binarySearch(list, worstCaseKey);
    long worstEndTime = System.nanoTime();

    // Populate the table with the recorded times.
    System.out.println("Best case time (nanoseconds): " + (bestEndTime - bestStartTime));
    System.out.println("Worst case time (nanoseconds): " + (worstEndTime - worstStartTime));
  }
}