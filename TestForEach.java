    /*******************************************************************************
     * Kean University
     * Semester (FALL 2023)
     * Course: CPS*2231*07 - Computer Programming
     * Author(s): Wilbert Villalobos CPS2231*07
     * Unit 3 Assignment
     * Program Description: Given any integer, the program displays the minimum
     * value
     *************************************************************************/

import java.util.ArrayList;
import java.util.Collection;

public class TestForEach {
    public static void main(String[] args) {
        // Collection of Strings
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        System.out.println("City names in uppercase:");
        collection.forEach(e -> System.out.print(e.toUpperCase() + " "));
        
        // New ArrayList of Integers for Kean ID digits
        Collection<Integer> collection2 = new ArrayList<>();
        // Assuming Kean ID is 1228068
        int[] keanID = {1, 2, 2, 8, 0, 6, 8};
        for (int id : keanID) {
            collection2.add(id);
        }

        // Task 3.2: Print each number times 2
        System.out.println("\n\nEach Kean ID digit times 2:");
        collection2.forEach(e -> System.out.print(e * 2 + " "));

        // Task 3.3: Print the square of each number
        System.out.println("\nSquare of each Kean ID digit:");
        collection2.forEach(e -> System.out.print((e * e) + " "));

        // Task 3.4: Print the logarithm (base 10) of each number
        System.out.println("\nLogarithm (base 10) of each Kean ID digit:");
        collection2.forEach(e -> System.out.print((e == 0 ? "undefined " : Math.log10(e) + " ")));
    }
}
