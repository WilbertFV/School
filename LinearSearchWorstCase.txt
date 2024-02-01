public class LinearSearchWorstCase {
  public static int linearSearch(int[] list, int key) {
      for (int i = 0; i < list.length; i++) {
          if (key == list[i]) return i;
      }
      return -1;
  }

  public static void main(String[] args) {
      final int N = 100;  
      int[] list = new int[N];
      final int KEY = -1;  // Key is not in the array

      // Fill the array with numbers different from the key
      for (int i = 0; i < N; i++) {
          list[i] = i;
      }

      long begin = System.nanoTime();
      linearSearch(list, KEY);
      long end = System.nanoTime();

      System.out.println("Worst case time for N = " + N + ": " + (end - begin) + " nanoseconds.");
  }
}
