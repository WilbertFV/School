import java.util.Comparator;

public class LibraryItemComparator implements Comparator<LibraryItem<?, ?, ?>> {
  @Override
  public int compare(LibraryItem<?, ?, ?> o1, LibraryItem<?, ?, ?> o2) {
      String year1 = o1.getPublicationYear().toString();
      String year2 = o2.getPublicationYear().toString();
      return year1.compareTo(year2);
  }
}
