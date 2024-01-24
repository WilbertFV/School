public class Sushi implements Edible {

    /*******************************************************************************
   * Kean University
   * Semester (Spring 2024)
   * Course: CPS*2232*02 - Data Structures
   * Author(s): Wilbert Villalobos
   *************************************************************************/
  
  private String fishType;

  public Sushi(String fishType) {
      this.fishType = fishType;
  }

  public Sushi() {
      this.fishType = "Salmon";
  }

  public String getFishType() {
      return fishType;
  }

  public void setFishType(String fishType) {
      this.fishType = fishType;
  }

  @Override
  public String howToEat() {
      return "Eat sushi with chopsticks and a bit of soy sauce.";
  }

  public String favoriteFish() {
      return "Favorite fish in this sushi is: " + fishType;
  }

  @Override
  public String toString() {
      return "Sushi with fish type: " + fishType;
  }
}
