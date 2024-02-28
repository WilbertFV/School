import java.time.LocalDate;
import java.util.Comparator;

public class GenericBerryComparator implements Comparator<GenericBerry<Double, LocalDate>> {
    @Override
    public int compare(GenericBerry<Double, LocalDate> o1, GenericBerry<Double, LocalDate> o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
