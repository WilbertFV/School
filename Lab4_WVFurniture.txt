enum Color {
	RED, GREEN, BLUE, YELLOW, BLACK, WHITE, BROWN, GRAY, Pink;
}

public class Lab4_WVFurniture {

	/*******************************************************************************
	 * Kean University
	 * Semester (FALL 2023)
	 * Course: CPS*2231*07 - Computer Programming
	 * Author(s): Wilbert Villalobos CPS2231*07
	 * Unit 5 HW 3
	 * Program Description: Create a class, an enum, and a record
	 *************************************************************************/

	// Enum to represent different materials
	enum Material {
		WOOD,
		GLASS,
		FABRIC,
		METAL,
		PLASTIC,
		UNKNOWN
	}

	// Color class
	static class Color {
		private String name;

		// Default constructor for Color
		public Color() {
			this.name = "Unknown"; // Default color
		}

		// Parameterized constructor for Color
		public Color(String name) {
			this.name = name;
		}

		public String toString() {
			return name;
		}
	}

	// Lab4_WVFurniture class

	private String name;
	private double price;
	private Material material;
	private Color color;
	private int totalInstances;

	// Default constructor
	public Lab4_WVFurniture() {
		this.name = "";
		this.price = 0.0;
		this.material = Material.UNKNOWN;
		this.color = new Color(); // Use the default constructor
		this.totalInstances = 0;
	}

	// Constructor Parameters
	public Lab4_WVFurniture(String name, double price, Material material, Color color) {
		this.name = name;
		this.price = price;
		this.material = material;
		this.color = color;
		this.totalInstances = 0;
	}

	// Getter and Setter methods for 'name'
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter and Setter methods for 'price'
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Getter and Setter methods for 'material'
	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	// Getter and Setter methods for 'color'
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// Getter and Setter methods for 'totalInstances'
	public int getTotalInstances() {
		return totalInstances;
	}

	public void setTotalInstances(int totalInstances) {
		this.totalInstances = totalInstances;
	}

	// Display information about the furniture
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Material: " + material);
		System.out.println("Color: " + color);
		System.out.println("Total Instances: " + totalInstances);
	}

	// Print a table of furniture information
	public static void printFurnitureTable(Lab4_WVFurniture[] furnitureArray) {
		System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", "Name", "Price", "Material", "Color", "Total Instances");
		for (Lab4_WVFurniture furniture : furnitureArray) {
			System.out.printf("%-15s $%-14.2f %-15s %-15s %-15d%n", furniture.name, furniture.price, furniture.material,
					furniture.color, furniture.totalInstances);
		}
	}

	// Generate a string representation of the furniture
	public String toString() {
		return "Name: " + name + "\nPrice: " + price + "\nMaterial: " + material + "\nColor: " + color
				+ "\nTotal Instances: " + totalInstances;
	}

	public static void main(String[] args) {
		Lab4_WVFurniture chair = new Lab4_WVFurniture("Chair", 49.99, Material.WOOD, new Color("Brown"));
		chair.setTotalInstances(5);

		Lab4_WVFurniture table = new Lab4_WVFurniture("Table", 149.99, Material.GLASS, new Color("Black"));
		table.setTotalInstances(3);

		Lab4_WVFurniture sofa = new Lab4_WVFurniture("Sofa", 299.99, Material.FABRIC, new Color("Red"));
		sofa.setTotalInstances(2);

		Lab4_WVFurniture[] furnitureArray = { chair, table, sofa };
		Lab4_WVFurniture.printFurnitureTable(furnitureArray);
	}
}
