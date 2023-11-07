import java.util.ArrayList;

public class HW6_Part2 {

  /*******************************************************************************
   * Kean University
   * Semester (FALL 2023)
   * Course: CPS*2231*07 - Computer Programming
   * Author(s): Wilbert Villalobos CPS2231*07
   * Homework 6 Part 2
   * Program Description:
   * Adds elements to ArrayList, times operation, prints with lambda.
   *************************************************************************/
  
  public static void main(String[] args) {

    long startTime = System.currentTimeMillis();

    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
      arrayList.add(i);
    }

    for (int i = 11; i < 50; i++) {
      arrayList.add(i);
      System.out.println("ArrayList size: " + arrayList.size());
    }

    long endTime = System.currentTimeMillis();
    double durationSeconds = (endTime - startTime) / 1000.0;
    System.out.println("Run-time to store all 40 integers: " + durationSeconds + " seconds");

    arrayList.forEach(num -> System.out.print(num + " "));
  }
}
