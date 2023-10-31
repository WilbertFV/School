public class HW5_Computer {

  /*******************************************************************************
   * Kean University
   * Semester (FALL 2023)
   * Course: CPS*2231*07 - Computer Programming
   * Author(s): Wilbert Villalobos CPS2231*07
   * Homework 5
   * Program Description:
   * generic computer, including its manufacturer,
   * disk size, manufacturing date, and number of cores, with appropriate
   * constructors, getter and
   * setter methods, and a toString method for output.
   *************************************************************************/

  private String manufacturer;
  private long diskSize;
  private String manufacturingDate;
  private int numberOfCores;

  public HW5_Computer() {
  }

  public HW5_Computer(String manufacturer, long diskSize, String manufacturingDate, int numberOfCores) {
    this.manufacturer = manufacturer;
    this.diskSize = diskSize;
    this.manufacturingDate = manufacturingDate;
    this.numberOfCores = numberOfCores;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public long getDiskSize() {
    return diskSize;
  }

  public void setDiskSize(long diskSize) {
    this.diskSize = diskSize;
  }

  public String getManufacturingDate() {
    return manufacturingDate;
  }

  public void setManufacturingDate(String manufacturingDate) {
    this.manufacturingDate = manufacturingDate;
  }

  public int getNumberOfCores() {
    return numberOfCores;
  }

  public void setNumberOfCores(int numberOfCores) {
    this.numberOfCores = numberOfCores;
  }

  @Override
  public String toString() {
    return "Manufacturer: " + manufacturer + ", Disk Size: " + diskSize + " bytes, Manufacturing Date: "
        + manufacturingDate + ", Number of cores: " + numberOfCores;
  }
}
