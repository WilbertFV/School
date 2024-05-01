import java.util.Arrays;
import java.util.List;

public class TestGraph {
  public static void main(String[] args) {
    try {
      // Define vertices and edges
      Integer[] vertices = { 0, 1, 2, 3, 4 };
      int[][] edges = {
          { 0, 1 }, { 0, 2 }, { 0, 3 },
          { 1, 0 }, { 1, 4 },
          { 2, 0 },
          { 3, 0 }, { 3, 4 },
          { 4, 1 }, { 4, 3 }
      };

      // Create a graph with the array of edges
      Graph<Integer> graph1 = new UnweightedGraph<>(Arrays.asList(vertices), edges);
      System.out.println("The number of vertices in graph1: " + graph1.getSize());
      graph1.printEdges();

      // Create another graph using a list of Edge objects
      List<Edge> edgeList = Arrays.asList(
          new Edge(0, 1), new Edge(0, 2), new Edge(0, 3),
          new Edge(1, 0), new Edge(1, 4),
          new Edge(2, 0),
          new Edge(3, 0), new Edge(3, 4),
          new Edge(4, 1), new Edge(4, 3));
      Graph<Integer> graph2 = new UnweightedGraph<>(Arrays.asList(vertices), edgeList);
      System.out.println("The number of vertices in graph2: " + graph2.getSize());
      graph2.printEdges();
    } catch (Exception e) {
      e.printStackTrace(); // Print any exceptions to understand what went wrong
    }
  }
}
