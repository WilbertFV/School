enum Color {
	RED, GREEN, BLUE, YELLOW, BLACK, WHITE, BROWN, GRAY;
}

public class Lab4_WVFurniture {

	// Data Fields
	private String name;
	private double price;
	private String material;
	private Color color;
	private static int totalInstances = 0;

	// Constructors
	public Lab4_WVFurniture() {
		totalInstances++;
	}

	public Lab4_WVFurniture(String name, double price, String material, Color color) {
		this.name = name;
		this.price = price;
		this.material = material;
		this.color = color;
		totalInstances++;
	}

	// Getters
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getMaterial() {
		return material;
	}

	public Color getColor() {
		return color;
	}

	public static int getTotalInstances() {
		return totalInstances;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// toString Method
	@Override
	public String toString() {
		return String.format("%-15s $%-14.2f %-15s %-15s %-15d",
				name, price, material, color, totalInstances);
	}

	// Static method to print all Lab4_WVFurniture pieces
	public static void printThemAll(Lab4_WVFurniture[] f) {
		System.out.printf("%-15s %-15s %-15s %-15s %-15s%n",
				"Name", "Price", "Material", "Color", "Total Instances");
		for (Lab4_WVFurniture furniture : f) {
			System.out.println(furniture);
		}
	}

	// Main Method
	public static void main(String[] args) {
		Lab4_WVFurniture chair = new Lab4_WVFurniture("Chair", 49.99, "Wood", Color.BROWN);
		Lab4_WVFurniture table = new Lab4_WVFurniture("Table", 149.99, "Glass", Color.BLACK);
		Lab4_WVFurniture sofa = new Lab4_WVFurniture("Sofa", 299.99, "Fabric", Color.RED);

		Lab4_WVFurniture[] furnitureArray = { chair, table, sofa };
		Lab4_WVFurniture.printThemAll(furnitureArray);
	}
}
