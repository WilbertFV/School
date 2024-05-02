import java.util.ArrayList;
import java.util.List;

public class GraphTest {
  public static void main(String[] args) {
    Integer[] vertices = { 0, 1, 2, 3, 4 };
    int[][] edges = {
        { 0, 1 }, { 0, 4 }, { 4, 2 }, { 4, 3 }, { 3, 2 }
    };

    // Create the graph using UnweightedGraph
    Graph<Integer> graph = new UnweightedGraph<>(vertices, edges);

    // Edge Array (Already defined above as 'edges')
    System.out.println("Edge Array:");
    for (int[] edge : edges) {
      System.out.println("(" + edge[0] + ", " + edge[1] + ")");
    }

    // Adjacency Matrix
    int[][] adjacencyMatrix = createAdjacencyMatrix(graph, vertices.length);
    System.out.println("\nAdjacency Matrix:");
    printMatrix(adjacencyMatrix);

    // Adjacency List
    List<List<Integer>> adjacencyList = createAdjacencyList(graph, vertices.length);
    System.out.println("\nAdjacency List:");
    printAdjacencyList(adjacencyList);

    // Perform DFS from vertex 0
    UnweightedGraph<Integer>.SearchTree dfsTree = graph.dfs(0);
    System.out.println("\nDFS from vertex 0:");
    dfsTree.printTree();

    // Perform BFS from vertex 0
    UnweightedGraph<Integer>.SearchTree bfsTree = graph.bfs(0);
    System.out.println("\nBFS from vertex 0:");
    bfsTree.printTree();
  }

  private static int[][] createAdjacencyMatrix(Graph<Integer> graph, int size) {
    int[][] matrix = new int[size][size];
    for (int i = 0; i < size; i++) {
      List<Integer> neighbors = graph.getNeighbors(i);
      for (int neighbor : neighbors) {
        matrix[i][neighbor] = 1;
      }
    }
    return matrix;
  }

  private static List<List<Integer>> createAdjacencyList(Graph<Integer> graph, int size) {
    List<List<Integer>> list = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      list.add(graph.getNeighbors(i));
    }
    return list;
  }

  private static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int val : row) {
        System.out.print(val + " ");
      }
      System.out.println();
    }
  }

  private static void printAdjacencyList(List<List<Integer>> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.print(i + ": ");
      for (int val : list.get(i)) {
        System.out.print(val + " ");
      }
      System.out.println();
    }
  }
}
