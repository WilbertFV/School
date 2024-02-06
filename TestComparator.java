import java.util.Comparator;

// Assuming Rectangle and Circle are defined elsewhere in your project
public class TestComparator {
    public static void main(String[] args) {
        GeometricObject g1 = new Rectangle(5, 5); // Replace with actual Rectangle implementation
        GeometricObject g2 = new Circle(5);       // Replace with actual Circle implementation

        GeometricObject g = max(g1, g2, new GeometricObjectComparator());
        System.out.println("The perimeter of the larger object is " + g.getPerimeter());
    }
  
    public static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c) {
        return c.compare(g1, g2) > 0 ? g1 : g2;
    }
}
