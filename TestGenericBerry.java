import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestGenericBerry {
    public static void main(String[] args) {
        // HashSet example
        Set<GenericBerry<Double, LocalDate>> hashSet = new HashSet<>();
        hashSet.add(new GenericBerry<>(5.99, LocalDate.of(2024, 1, 31)));
        hashSet.add(new GenericBerry<>(3.49, LocalDate.of(2024, 2, 15)));
        hashSet.add(new GenericBerry<>(2.99, LocalDate.of(2024, 3, 10)));
        hashSet.add(new GenericBerry<>(4.99, LocalDate.of(2024, 1, 20)));
        
        System.out.println("Hash Set of Generic Berries: " + hashSet);

        // TreeSet example with Comparator
        Set<GenericBerry<Double, LocalDate>> treeSet = new TreeSet<>(new GenericBerryComparator());
        treeSet.add(new GenericBerry<>(5.99, LocalDate.of(2024, 1, 31)));
        treeSet.add(new GenericBerry<>(3.49, LocalDate.of(2024, 2, 15)));
        treeSet.add(new GenericBerry<>(2.99, LocalDate.of(2024, 3, 10)));
        treeSet.add(new GenericBerry<>(4.99, LocalDate.of(2024, 1, 20)));

        System.out.println("Tree Set of Generic Berries: " + treeSet);
    }
}
