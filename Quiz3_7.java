public class Quiz3_7 {

  /*
   * Method Overloading:
   * Overload a method named findArea to calculate the area of a circle and a
   * rectangle. How would you call each version of the overloaded method to find 
   * the areas of a circle with radius 5 and a rectangle with length 4 and width 7?
   */

public static void findArea(int radius){

  double area = Math.PI * Math.pow(radius,2);
  System.out.println("The area of the circle is: " + area);
}

public static void findArea(int length, int width){
  
  int area = length * width;
  System.out.println("The area of the rectangle is: " + area);
}

public static void main (String [] args){

  int radius =5;
  int length=4, width=7;

  findArea(radius);
  findArea(length, width);
}
}
