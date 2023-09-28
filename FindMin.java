public class FindMin {

    /*******************************************************************************
  * Kean University
  * Semester (FALL 2023)
  * Course: CPS*2231*07 - Computer Programming
  * Author(s): Wilbert Villalobos CPS2231*07
  * Unit 3 Assignment
  * Program Description: Given any integer, the program displays the minimum value
  *************************************************************************/
  
public static void main (String[] args){

    // We have 2 numbers an we are going to use Math.min() to find the minimum number
    int a,b;
    a=2;
    b=5;
    System.out.println("The minimum of " + a + " and " + b + " is " + Math.min(a,b));

    // a=4, b=4
    a=4;
    b=4;
    System.out.println("The minimum of " + a + " and " + b + " is " + Math.min(a,b));

    //a=1000, b=2000
    a=1000;
    b=2000;
    System.out.println("The minimum of " + a + " and " + b + " is " + Math.min(a,b));

    //a=100, b=101
    a=100;
    b=101;
    System.out.println("The minimum of " + a + " and " + b + " is " + Math.min(a,b));

  }
 
}
