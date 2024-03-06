import java.time.Year;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LibraryItemSets<T, D, N> {
    private T itemId;
    private D publicationYear;
    private N title;

    public LibraryItemSets(T itemId, D publicationYear, N title) {
        this.itemId = itemId;
        this.publicationYear = publicationYear;
        this.title = title;
    }

    public T getItemId() { return itemId; }
    public D getPublicationYear() { return publicationYear; }
    public N getTitle() { return title; }

    @Override
    public String toString() {
        return "ItemId: " + itemId + ", PublicationYear: " + publicationYear + ", Title: " + title;
    }

    public static void main(String[] args) {
        // Create LibraryItem instances
        LibraryItem<Integer, Year, String> item1 = new LibraryItem<>(1, Year.of(2020), "The Art of Computer Programming");
        LibraryItem<Integer, Year, String> item2 = new LibraryItem<>(2, Year.of(1989), "Clean Code");
        LibraryItem<Integer, Year, String> item3 = new LibraryItem<>(3, Year.of(1995), "Design Patterns");

        // Create different sets
        Set<LibraryItem<Integer, Year, String>> hashSet = new HashSet<>();
        Set<LibraryItem<Integer, Year, String>> linkedHashSet = new LinkedHashSet<>();
        Set<LibraryItem<Integer, Year, String>> treeSet = new TreeSet<>(new Comparator<LibraryItem<Integer, Year, String>>() {
            @Override
            public int compare(LibraryItem<Integer, Year, String> o1, LibraryItem<Integer, Year, String> o2) {
                return o1.getPublicationYear().compareTo(o2.getPublicationYear());
            }
        });

        // Add items to sets
        Arrays.asList(item1, item2, item3).forEach(item -> {
            hashSet.add(item);
            linkedHashSet.add(item);
            treeSet.add(item);
        });

        // Print set contents
        System.out.println("HashSet contents:");
        printSetContents(hashSet);
        System.out.println("\nLinkedHashSet contents:");
        printSetContents(linkedHashSet);
        System.out.println("\nTreeSet contents:");
        printSetContents(treeSet);
    }

    private static void printSetContents(Set<LibraryItem<Integer, Year, String>> set) {
        set.forEach(System.out::println);
    }
}
