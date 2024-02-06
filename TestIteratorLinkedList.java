import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class TestIteratorLinkedList {
    public static void main(String[] args) {
        Collection<String> collection = new LinkedList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        // Using for-each loop
        for (String city : collection) {
            System.out.print(city.charAt(0) + " ");
        }
        System.out.println();

        // Using iterator
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.print(city.charAt(0) + " ");
        }
        System.out.println();
    }
}
