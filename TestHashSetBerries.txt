/*******************************************************************************
 * Kean University- Spring 2024
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos
 * Assignment 3
 *************************************************************************/

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class TestHashSetBerries {
    public static void main(String[] args) {
        Set<Berry> berrySet = new HashSet<>();
        berrySet.add(new Berry(2.5, LocalDate.of(2024, 2, 20)));
        berrySet.add(new Berry(3.0, LocalDate.of(2024, 3, 15)));
        berrySet.add(new Berry(2.8, LocalDate.of(2024, 2, 25)));
        berrySet.add(new Berry(3.2, LocalDate.of(2024, 3, 18)));

        // Display berries in the HashSet
        System.out.println("Berries in HashSet:");
        berrySet.forEach(System.out::println);
    }
}
