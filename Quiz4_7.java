public class Quiz4_7 {
  
  /*
   * Return Value in Method:
   * Create a method named findAverage that takes an array of integers and returns
   * the average value.
   * What would be the return value if the method is passed an array containing
   * the values
   * [4, 8, 15, 16, 23, 42]?
   * 
   */

  public static void findAverage() {

    int[] arr = new int[] { 4, 8, 15, 16, 23, 42 };
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {

      sum += arr[i];
    }
    int avg = sum / arr.length;
    System.out.println("The average is: " + avg);
  }

  public static void main(String[] args) {

    findAverage();
  }
}
