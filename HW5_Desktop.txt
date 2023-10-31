public class HW5_Desktop extends HW5_Computer {

  /*******************************************************************************
   * Kean University
   * Semester (FALL 2023)
   * Course: CPS*2231*07 - Computer Programming
   * Author(s): Wilbert Villalobos CPS2231*07
   * Homework 5
   * Program Description:
   * Includes screen dimensions
   * Child class 1/2
   * Overrides toString
   *************************************************************************/

  private int width;
  private int height;

  public HW5_Desktop() {
  }

  public HW5_Desktop(String manufacturer, long diskSize, String manufacturingDate, int numberOfCores, int width,
      int height) {
    super(manufacturer, diskSize, manufacturingDate, numberOfCores);
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public String toString() {
    return super.toString() + ", Width: " + width + ", Height: " + height;
  }
}
