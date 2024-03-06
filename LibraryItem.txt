import java.time.Year;

public class LibraryItem<T, D, N> {
    private T itemId;
    private D publicationYear;
    private N title;

    public LibraryItem(T itemId, D publicationYear, N title) {
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
        // Using Integer, String, and String types
        LibraryItem<Integer, String, String> book1 = new LibraryItem<>(1, "2020", "The Art of Computer Programming");
        
        // Using String, Year, and String types
        LibraryItem<String, Year, String> book2 = new LibraryItem<>("Coding Resource", Year.of(2013), "Algorithms (4th Edition)");
        
        // Using Integer, Integer, and String types
        LibraryItem<Integer, Integer, String> book3 = new LibraryItem<>(101, 1997, "Structure and Interpretation of Computer Programs");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
