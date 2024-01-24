public interface Edible {

    /*******************************************************************************
   * Kean University
   * Semester (Spring 2024)
   * Course: CPS*2232*02 - Data Structures
   * Author(s): Wilbert Villalobos
   *************************************************************************/

  String howToEat();

  default String howToCook() {
      return "Cooking instructions not provided.";
  }
}
