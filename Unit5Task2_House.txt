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

    private int numberOfBedrooms;
    private double totalSquareFeet;
    private boolean hasGarage;

    // Constructor
    public Unit5Task2_House(int numberOfBedrooms, double totalSquareFeet, boolean hasGarage) {
        this.numberOfBedrooms = numberOfBedrooms;
        this.totalSquareFeet = totalSquareFeet;
        this.hasGarage = hasGarage;
    }

    // Getter and Setter methods
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public double getTotalSquareFeet() {
        return totalSquareFeet;
    }

    public void setTotalSquareFeet(double totalSquareFeet) {
        this.totalSquareFeet = totalSquareFeet;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    // Custom methods
    public void openDoor() {
        System.out.println("The door of the house is now open.");
    }

    public void turnOnLights() {
        System.out.println("The lights in the house are turned on.");
    }

    // Extra credit method
    public void describeHouse() {
        System.out.println("This house has " + numberOfBedrooms + " bedrooms and covers an area of " + totalSquareFeet
                + " square feet.");
        if (hasGarage) {
            System.out.println("Additionally, this house has a garage.");
        } else {
            System.out.println("Unfortunately, this house doesn't have a garage.");
        }
    }

    public static void main(String[] args) {

        Unit5Task2_House myHouse = new Unit5Task2_House(3, 2000.0, true);

        // Using setter methods to update some properties
        myHouse.setNumberOfBedrooms(4);
        myHouse.setTotalSquareFeet(2500.0);

        // Using custom methods to perform actions
        myHouse.openDoor();
        myHouse.turnOnLights();

        // Using the extra credit method to describe the house
        myHouse.describeHouse();

        // Creating another object of the Unit5Task2_House class
        Unit5Task2_House neighborHouse = new Unit5Task2_House(2, 1500.0, false);

        // Using the extra credit method
        neighborHouse.describeHouse();
    }
}