public class Quiz6_7 {
  /*
   * Pass by Value:
   * In a method named updateValue, try to change the value of a passed integer
   * argument to 10. What happens to the original value of the integer in the
   * calling method?
   */

   public static void updateValue(int num){

      int a = 10;
      System.out.println("The value of a is: " + a);
   }

   public static void main (String[] args){

    int original=5;
    updateValue(original);

    System.out.println("The changed value is now: " + original);
   }
}
