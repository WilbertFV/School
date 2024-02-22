/*******************************************************************************
 * Kean University- Spring 2024
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos
 * Assignment 3
 *************************************************************************/

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetBerries {
    public static void main(String[] args) {
        Set<Berry> treeSet = new TreeSet<>(new BerryComparator());
        treeSet.add(new Berry(2.5, LocalDate.of(2024, 2, 20)));
        treeSet.add(new Berry(3.0, LocalDate.of(2024, 3, 15)));
        treeSet.add(new Berry(2.8, LocalDate.of(2024, 2, 25)));
        treeSet.add(new Berry(3.2, LocalDate.of(2024, 3, 18)));

        // Display berries in the TreeSet
        System.out.println("Berries in TreeSet:");
        treeSet.forEach(System.out::println);
    }
}
