import java.util.ArrayList;
import java.util.Collection;

public class TestIteratorLowerCase {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("New York"); 
        collection.add("Atlanta"); 
        collection.add("Dallas"); 
        collection.add("Madison"); 

        // Using for-each loop
        for (String city : collection) {
            System.out.print(city.toLowerCase() + " ");
        }
        System.out.println();
    }
}
