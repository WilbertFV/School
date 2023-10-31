public class HW5_Laptop extends HW5_Computer {

  /*******************************************************************************
   * Kean University
   * Semester (FALL 2023)
   * Course: CPS*2231*07 - Computer Programming
   * Author(s): Wilbert Villalobos CPS2231*07
   * Homework 5
   * Program Description:
   * Includes Variable Weight
   * Child class 2/2
   * Overrides toString
   *************************************************************************/

  private double weight;

  public HW5_Laptop() {
  }

  public HW5_Laptop(String manufacturer, long diskSize, String manufacturingDate, int numberOfCores, double weight) {
    super(manufacturer, diskSize, manufacturingDate, numberOfCores);
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return super.toString() + ", Weight: " + weight;
  }
}
