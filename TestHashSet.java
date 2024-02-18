import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
  public static void main(String[] args) {
    // Create a hash set for integers
    Set<Integer> set = new HashSet<>();

    // Add numbers to the set
    set.add(34);
    set.add(7);
    set.add(23);
    set.add(64);
    set.add(12);
    set.add(23); // This will not be added as duplicate

    System.out.println(set);

    // Display the elements in the hash set
    for (Integer i : set) {
      System.out.print(i + " ");
    }
    
    // Process the elements using a forEach method
    System.out.println();
    set.forEach(e -> System.out.print(e + " "));
  }
}
