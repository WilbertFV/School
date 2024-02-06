/*******************************************************************************
 * Kean Univesity-
 * Semester (Spring 2024)
 * Course: CPS*2232*01 - Data Structures
 * Author(s): Wilbert Villalobos CPS2232*01
 * Assignment- Lab 3
 *************************************************************************/

import java.util.Collection;
import java.util.LinkedList;

public class TestCollectionLinkedList {
    public static void main(String[] args) {
        Collection<String> collection1 = new LinkedList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");
        collection1.add("Boston");
        collection1.add("Denver");

        System.out.println("A list of cities in collection1 (LinkedList):");
        System.out.println(collection1);

        collection1.remove("Dallas");
        System.out.println("\n" + collection1.size() + " cities are in collection1 now");

        Collection<String> collection2 = new LinkedList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angles");
        collection2.add("Atlanta");

        System.out.println("\nA list of cities in collection2:");
        System.out.println(collection2);

        Collection<String> c1 = new LinkedList<>(collection1);
        c1.addAll(collection2);
        System.out.println("\nCities in collection1 or collection2: ");
        System.out.println(c1);

        c1 = new LinkedList<>(collection1);
        c1.retainAll(collection2);
        System.out.println("\nCities in collection1 and collection2: ");
        System.out.println(c1);

        c1 = new LinkedList<>(collection1);
        c1.removeAll(collection2);
        System.out.println("\nCities in collection1, but not in 2: ");
        System.out.println(c1);
    }
}
