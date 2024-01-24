public class Soup implements Edible {

  /*******************************************************************************
   * Kean University
   * Semester (Spring 2024)
   * Course: CPS*2232*02 - Data Structures
   * Author(s): Wilbert Villalobos
   *************************************************************************/

  private boolean isVegetarian;

  public Soup(boolean isVegetarian) {
      this.isVegetarian = isVegetarian;
  }

  public Soup() {
      this.isVegetarian = true;
  }

  public boolean isVegetarian() {
      return isVegetarian;
  }

  public void setVegetarian(boolean isVegetarian) {
      this.isVegetarian = isVegetarian;
  }

  @Override
  public String howToEat() {
      return "Eat soup with a spoon. Serve hot.";
  }

  public String dietaryPreference() {
      return isVegetarian ? "This soup is vegetarian." : "This soup contains meat.";
  }

  @Override
  public String toString() {
      return "Soup " + (isVegetarian ? "Vegetarian" : "Non-Vegetarian");
  }
}
