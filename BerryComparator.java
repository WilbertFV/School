/*******************************************************************************
 * Kean University- Spring 2024
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos
 * Assignment 3
 *************************************************************************/

import java.util.Comparator;

public class BerryComparator implements Comparator<Berry> {
    @Override
    public int compare(Berry b1, Berry b2) {
        // Define comparison logic here, e.g., based on price
        return Double.compare(b1.getPrice(), b2.getPrice());
    }
}
