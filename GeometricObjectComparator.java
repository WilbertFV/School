import java.util.Comparator;

// Assuming GeometricObject is defined elsewhere in your project
public class GeometricObjectComparator implements Comparator<GeometricObject>, java.io.Serializable {
    public int compare(GeometricObject o1, GeometricObject o2) {
        double perimeter1 = o1.getPerimeter();
        double perimeter2 = o2.getPerimeter();
        return Double.compare(perimeter1, perimeter2);
    }
}
