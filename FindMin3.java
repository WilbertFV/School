import java.util.Scanner;

public class FindMin3 {

  /*******************************************************************************
   * Kean University
   * Semester (FALL 2023)
   * Course: CPS*2231*07 - Computer Programming
   * Author(s): Wilbert Villalobos CPS2231*07
   * Unit 3 Assignment
   * Program Description: Given any integer, the program displays the minimum
   * value
   *************************************************************************/

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Ask for the first and second integer
    System.out.println("Enter an integer for A: ");
    int a = input.nextInt();

    System.out.println("Enter an integer for B: ");
    int b = input.nextInt();

    // Closer scanner (good practice)
    input.close();

    // Print the minimum of a and b
    System.out.printf("The minimum of %4d and %4d is %5d\n", a, b, Math.min(a, b));
  }
}
