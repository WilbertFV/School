public class SelectionSortWorstCase {

  public static void selectionSort(double[] list) {
    for (int i = 0; i < list.length - 1; i++) {
        // Find the minimum in the list[i..list.length-1]
        double currentMin = list[i];
        int currentMinIndex = i;

        for (int j = i + 1; j < list.length; j++) {
            if (currentMin > list[j]) {
                currentMin = list[j];
                currentMinIndex = j;
            }
        }

        // Swap list[i] with list[currentMinIndex] if necessary
        if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
        }
    }
}

  public static void main(String[] args) {
      final int N = 100;
      double[] list = generateRandomArray(N);
      
      long startTime = System.nanoTime();
      selectionSort(list);
      long endTime = System.nanoTime();

      System.out.println("Worst Case Time (nanoseconds): " + (endTime - startTime));
  }

  private static double[] generateRandomArray(int size) {
      double[] array = new double[size];
      for (int i = 0; i < size; i++) {
          array[i] = Math.random() * 100 - 50; // Random numbers between -50 and 50
      }
      return array;
  }
}
