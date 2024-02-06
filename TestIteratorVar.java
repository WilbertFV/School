import java.util.Collection;
import java.util.LinkedList;

public class TestIteratorVar {
    public static void main(String[] args) {
        Collection<String> collection = new LinkedList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        // Using var with iterator
        var iterator = collection.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.print(city + " ");
        }
        System.out.println();
    }
}
