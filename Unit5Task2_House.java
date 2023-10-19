public class Unit5Task2_House {

    /*******************************************************************************
     * Kean University
     * Semester (FALL 2023)
     * Course: CPS*2231*07 - Computer Programming
     * Author(s): Wilbert Villalobos CPS2231*07
     * Unit 5 HW 3
     * Program Description: Describe a real world entity and explain its
     * characteristics and how it functions. Apply setters and getters
     *************************************************************************/

    // Instance variables representing the properties of a house
    private int numberOfBedrooms;
    private double totalSquareFeet;
    private boolean hasGarage;

    // Default constructor
    public Unit5Task2_House() {
        this.numberOfBedrooms = 0;
        this.totalSquareFeet = 0.0;
        this.hasGarage = false;
    }

    // Parameterized constructor
    public Unit5Task2_House(int numberOfBedrooms, double totalSquareFeet, boolean hasGarage) {
        this.numberOfBedrooms = numberOfBedrooms;
        this.totalSquareFeet = totalSquareFeet;
        this.hasGarage = hasGarage;
    }

    // Getter methods
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public double getTotalSquareFeet() {
        return totalSquareFeet;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    // Setter methods
    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public void setTotalSquareFeet(double totalSquareFeet) {
        this.totalSquareFeet = totalSquareFeet;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    // Custom method to simulate opening the door of the house
    public void openDoor() {
        System.out.println("The door of the house is now open.");
    }

    // Custom method to simulate turning on the lights in the house
    public void turnOnLights() {
        System.out.println("The lights in the house are turned on.");
    }

    public static void main(String[] args) {
        // Creating a new Unit5Task2_House object using the parameterized constructor
        Unit5Task2_House myHouse = new Unit5Task2_House(3, 2000.0, true);

        // Using setter methods to update some properties
        myHouse.setNumberOfBedrooms(4);
        myHouse.setTotalSquareFeet(2500.0);

        // Using custom methods to perform actions
        myHouse.openDoor();
        myHouse.turnOnLights();
    }
}
