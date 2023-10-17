enum Material {
  WOOD,
  GLASS,
  FABRIC,
  METAL,
  PLASTIC,
  UNKNOWN
}

public record Lab4_WVFurnitureRecord(

    /*******************************************************************************
     * Kean University
     * Semester (FALL 2023)
     * Course: CPS*2231*07 - Computer Programming
     * Author(s): Wilbert Villalobos CPS2231*07
     * Unit 5 HW 3
     * Program Description: Record portion of assignment
     *************************************************************************/

    String name,
    double price,
    Material material,
    String color) {

  public static int totalInstances;

  static {
    totalInstances++;
  }

  // Static method to print a table of furniture information
  public static void printFurnitureTable(Lab4_WVFurnitureRecord[] furnitureArray) {
    System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", "Name", "Price", "Material", "Color", "Total Instances");
    for (Lab4_WVFurnitureRecord furniture : furnitureArray) {
      System.out.printf("%-15s $%-14.2f %-15s %-15s %-15d%n", furniture.name(), furniture.price(), furniture.material(),
          furniture.color(), totalInstances);
    }
  }

  public static void main(String[] args) {
    Lab4_WVFurnitureRecord chair = new Lab4_WVFurnitureRecord("Chair", 49.99, Material.WOOD, "Brown");
    Lab4_WVFurnitureRecord table = new Lab4_WVFurnitureRecord("Table", 149.99, Material.GLASS, "Black");
    Lab4_WVFurnitureRecord sofa = new Lab4_WVFurnitureRecord("Sofa", 299.99, Material.FABRIC, "Red");

    Lab4_WVFurnitureRecord[] furnitureArray = { chair, table, sofa };
    Lab4_WVFurnitureRecord.printFurnitureTable(furnitureArray);
  }
}
