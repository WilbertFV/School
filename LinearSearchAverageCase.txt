public class LinearSearchAverageCase {
  public static int linearSearch(int[] list, int key) {
      for (int i = 0; i < list.length; i++) {
          if (key == list[i]) return i;
      }
      return -1;
  }

  public static void main(String[] args) {
      final int N = 100;
      int[] list = new int[N];
      int KEY = (int) (Math.random() * N);  // Random key within array range

      for (int i = 0; i < N; i++) {
          list[i] = i;
      }

      long begin = System.nanoTime();
      linearSearch(list, KEY);
      long end = System.nanoTime();

      System.out.println("Average case time for N = " + N + ": " + (end - begin) + " nanoseconds.");
  }
}
