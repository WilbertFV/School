public class HW6_Part1 {

  /*******************************************************************************
   * Kean University
   * Semester (FALL 2023)
   * Course: CPS*2231*07 - Computer Programming
   * Author(s): Wilbert Villalobos CPS2231*07
   * Homework 6 Part 1
   * Program Description:
   * Expands an array incrementally, recording time and printing elements.
   *************************************************************************/

  public static void main(String[] args) {

    long startTime = System.currentTimeMillis();

    Integer[] array = new Integer[10];
    for (int i = 0; i < 10; i++) {
      array[i] = i + 1;
    }

    for (int i = 11; i < 50; i++) {
      array = java.util.Arrays.copyOf(array, array.length + 1);
      array[array.length - 1] = i;
      System.out.println("Array length: " + array.length);
    }

    long endTime = System.currentTimeMillis();
    double durationSeconds = (endTime - startTime) / 1000.0;
    System.out.println("Run-time to add and store all 40 Integers: " + durationSeconds + " seconds");

    for (Integer num : array) {
      System.out.print(num + " ");
    }
  }
}
