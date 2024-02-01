public class RecursiveBinarySearch {

  public static int recursiveBinarySearch(int[] list, int key, int low, int high) {
    if (high < low) {
      return -1; // Key not found
    }

    int mid = low + (high - low) / 2;

    if (key == list[mid]) {
      return mid; // Key found
    } else if (key < list[mid]) {
      return recursiveBinarySearch(list, key, low, mid - 1);
    } else {
      return recursiveBinarySearch(list, key, mid + 1, high);
    }
  }

  public static void main(String[] args) {
    final int N = 100;
    int[] list = new int[N];
    for (int i = 0; i < N; i++) {
      list[i] = i;
    }

    int key = 50;

    long startTime = System.nanoTime();
    int resultIndex = recursiveBinarySearch(list, key, 0, list.length - 1);
    long endTime = System.nanoTime();

    System.out.println("Key found at index: " + resultIndex);
    System.out.println("Recursive search time: " + (endTime - startTime) + " nanoseconds.");
  }
}
