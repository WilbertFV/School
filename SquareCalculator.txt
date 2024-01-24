public class SquareCalculator {
  public static void main(String[] args) {
      int number = 5;
      int squared = square(number);
      System.out.println("The square of " + number + " is: " + squared);
  }

  public static int square(int num) {
      return num * num;
  }
}
