public class HW5_TestComputer {

  /*******************************************************************************
   * Kean University
   * Semester (FALL 2023)
   * Course: CPS*2231*07 - Computer Programming
   * Author(s): Wilbert Villalobos CPS2231*07
   * Homework 5
   * Program Description:
   * Test object-oriented inheritance and prints results
   *************************************************************************/
  
  public static void main(String[] args) {
    HW5_Computer computer1 = new HW5_Computer("Dell", 1189160321024L, "April 1, 2020", 2);
    HW5_Computer computer2 = new HW5_Computer("Apple Inc", 269283712040L, "March 31, 2020", 4);
    HW5_Computer computer3 = new HW5_Computer("Alienware", 842698103855L, "April 20, 2023", 6);

    System.out.println(computer1);
    System.out.println(computer2);
    System.out.println(computer3);

    HW5_Laptop laptop1 = new HW5_Laptop("HP", 500107862016L, "January 1, 2021", 4, 2.3);
    HW5_Laptop laptop2 = new HW5_Laptop("Lenovo", 256060514304L, "February 2, 2021", 4, 2.1);

    HW5_Desktop desktop1 = new HW5_Desktop("Acer", 500107862016L, "March 3, 2021", 4, 1920, 1080);
    HW5_Desktop desktop2 = new HW5_Desktop("Asus", 256060514304L, "April 4, 2021", 4, 1366, 768);

    System.out.println(laptop1);
    System.out.println(laptop2);
    System.out.println(desktop1);
    System.out.println(desktop2);
  }
}
