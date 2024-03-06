import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLibraryItemSorting {
    public static void main(String[] args) {
        // Create a list of LibraryItem objects
        List<LibraryItem<?, ?, ?>> libraryItems = new ArrayList<>();
        libraryItems.add(new LibraryItem<>(1, "2020", "The Art of Computer Programming"));
        libraryItems.add(new LibraryItem<>("Coding Resource", Year.of(2013), "Algorithms (4th Edition)"));
        libraryItems.add(new LibraryItem<>(101, 1997, "Structure and Interpretation of Computer Programs"));

        // Before sorting
        System.out.println("Before sorting:");
        libraryItems.forEach(System.out::println);

        // Sort the list using the LibraryItemComparator
        Collections.sort(libraryItems, new LibraryItemComparator());

        // After sorting
        System.out.println("\nAfter sorting:");
        libraryItems.forEach(System.out::println);
    }
}