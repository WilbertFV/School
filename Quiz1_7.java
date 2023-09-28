public class Quiz1_7 {

  /*
   * Methods:
   * Create a method named calculateSum() that takes two integers as arguments and
   * returns their sum.
   * How would you call this method to obtain the sum of 5 and 3?
   */

  public static void main(String[] args) {

    int a, b;

    a = 5;
    b = 3;

    calculateSum(a, b);
  }
  
  public static void calculateSum(int a, int b) {

    int sum = a + b;
    System.out.println("The sum is: " + sum);

  }
}
