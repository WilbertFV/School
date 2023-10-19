public class MidtermReview_Building {

  // Data Fields
  private String type;
  private int numberOfFloors;
  private double area;
  private boolean isResidential;

  // Constructors
  public MidtermReview_Building() {
    this.type = "";
    this.numberOfFloors = 0;
    this.area = 0.0;
    this.isResidential = false;
  }

  public MidtermReview_Building(String type, int numberOfFloors, double area, boolean isResidential) {
    this.type = type;
    this.numberOfFloors = numberOfFloors;
    this.area = area;
    this.isResidential = isResidential;
  }

  // Getters
  public String getType() {
    return type;
  }

  public int getNumberOfFloors() {
    return numberOfFloors;
  }

  public double getArea() {
    return area;
  }

  public boolean getIsResidential() {
    return isResidential;
  }

  // Setters
  public void setType(String type) {
    this.type = type;
  }

  public void setNumberOfFloors(int numberOfFloors) {
    this.numberOfFloors = numberOfFloors;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public void setIsResidential(boolean isResidential) {
    this.isResidential = isResidential;
  }

  // toString Method
  @Override
  public String toString() {
    return "Building{" +
        "type='" + type + '\'' +
        ", numberOfFloors=" + numberOfFloors +
        ", area=" + area +
        ", isResidential=" + isResidential +
        '}';
  }
}
