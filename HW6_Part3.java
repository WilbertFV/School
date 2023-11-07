
import java.util.Stack;

public class HW6_Part3 {

  /*******************************************************************************
   * Kean University
   * Semester (FALL 2023)
   * Course: CPS*2231*07 - Computer Programming
   * Author(s): Wilbert Villalobos CPS2231*07
   * Homework 6 Part 2
   * Program Description:
   * Pushes elements onto Stack, times operation, prints with lambda.
   *************************************************************************/
  
  public static void main(String[] args) {
 
    long startTime = System.currentTimeMillis();

    Stack<Integer> stack = new Stack<>();
    for (int i = 1; i <= 10; i++) {
      stack.push(i);
    }

    for (int i = 11; i < 50; i++) {
      stack.push(i);
      System.out.println("Stack size: " + stack.size());
    }

    long endTime = System.currentTimeMillis();
    double durationSeconds = (endTime - startTime) / 1000.0;
    System.out.println("Run-time to store all 40 integers in Stack: " + durationSeconds + " seconds");

    // Print the elements of the Stack using for-each method and lambda.
    stack.forEach(num -> System.out.print(num + " "));
  }
}
