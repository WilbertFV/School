import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnweightedGraph<V> implements Graph<V> {
  protected List<V> vertices = new ArrayList<>();
  protected List<List<Edge>> neighbors = new ArrayList<>();

  public UnweightedGraph() {
  }

  public UnweightedGraph(V[] vertices, int[][] edges) {
    for (V vertex : vertices) {
      addVertex(vertex);
    }
    for (int[] edge : edges) {
      addEdge(edge[0], edge[1]);
    }
  }

  public UnweightedGraph(List<V> vertices, List<Edge> edges) {
    for (V vertex : vertices) {
      addVertex(vertex);
    }
    createAdjacencyLists(edges, vertices.size());
  }

  public UnweightedGraph(List<Integer> asList, int[][] edges) {
    // TODO Auto-generated constructor stub
  }

  public void createAdjacencyLists(int[][] edges, int numberOfVertices) {
    for (int[] edge : edges) {
      addEdge(edge[0], edge[1]);
    }
  }

  public void createAdjacencyLists(List<Edge> edges, int numberOfVertices) {
    for (Edge edge : edges) {
      addEdge(edge.u, edge.v);
    }
  }

  @Override
  public int getSize() {
    return vertices.size();
  }

  @Override
  public List<V> getVertices() {
    return vertices;
  }

  @Override
  public V getVertex(int index) {
    return vertices.get(index);
  }

  @Override
  public int getIndex(V v) {
    return vertices.indexOf(v);
  }

  @Override
  public List<Integer> getNeighbors(int index) {
    List<Integer> result = new ArrayList<>();
    for (Edge e : neighbors.get(index)) {
      result.add(e.v);
    }
    return result;
  }

  @Override
  public int getDegree(int v) {
    return neighbors.get(v).size();
  }

  @Override
  public void printEdges() {
    for (int u = 0; u < neighbors.size(); u++) {
      System.out.print(vertices.get(u) + " (" + u + "): ");
      for (Edge e : neighbors.get(u)) {
        System.out.print("(" + vertices.get(e.u) + ", " + vertices.get(e.v) + ") ");
      }
      System.out.println();
    }
  }

  @Override
  public void clear() {
    vertices.clear();
    neighbors.clear();
  }

  @Override
  public boolean addVertex(V vertex) {
    if (!vertices.contains(vertex)) {
      vertices.add(vertex);
      neighbors.add(new ArrayList<Edge>());
      return true;
    }
    return false;
  }

  @Override
  public boolean addEdge(int u, int v) {
    if (u < vertices.size() && v < vertices.size()) {
      neighbors.get(u).add(new Edge(u, v));
      return true;
    }
    return false; // Return false if indices are out of bounds
  }

  @Override
  public boolean addEdge(Edge e) {
    if (e.u < 0 || e.u >= getSize() || e.v < 0 || e.v >= getSize()) {
      throw new IllegalArgumentException("Vertex number out of bounds");
    }
    neighbors.get(e.u).add(e);
    return true;
  }

  @Override
  public boolean remove(V vertex) {
    int index = vertices.indexOf(vertex);
    if (index != -1) {
      vertices.remove(index);
      neighbors.remove(index);
      return true;
    }
    return false;
  }

  @Override
  public boolean remove(int u, int v) {
    return neighbors.get(u).remove(new Edge(u, v));
  }

  @Override
  public SearchTree dfs(int v) {
    if (v < 0 || v >= vertices.size()) {
      throw new IllegalArgumentException("Vertex index out of range for DFS: " + v);
    }
    boolean[] isVisited = new boolean[vertices.size()]; // Ensure size matches number of vertices
    int[] parent = new int[vertices.size()];
    Arrays.fill(parent, -1); // Initialize all parents to -1 indicating no parent
    List<Integer> searchOrder = new ArrayList<>();
    dfs(v, parent, isVisited, searchOrder);
    return new SearchTree(v, parent, searchOrder, this);
  }

  private void dfs(int u, int[] parent, boolean[] isVisited, List<Integer> searchOrder) {
    searchOrder.add(u);
    isVisited[u] = true;
    for (Edge e : neighbors.get(u)) {
      if (!isVisited[e.v]) {
        parent[e.v] = u; // Set the parent of the vertex
        dfs(e.v, parent, isVisited, searchOrder); // Recursively visit the vertex
      }
    }
  }

  @Override
  public SearchTree bfs(int v) {
    boolean[] isVisited = new boolean[getSize()];
    int[] parent = new int[getSize()];
    List<Integer> searchOrder = new ArrayList<>();
    java.util.Queue<Integer> queue = new java.util.LinkedList<>();
    queue.offer(v);
    isVisited[v] = true;
    while (!queue.isEmpty()) {
      int u = queue.poll();
      searchOrder.add(u);
      for (Edge e : neighbors.get(u)) {
        if (!isVisited[e.v]) {
          queue.offer(e.v);
          isVisited[e.v] = true;
          parent[e.v] = u;
        }
      }
    }
    return new SearchTree(v, parent, searchOrder, this);
  }

  public class SearchTree {
    private int root;
    private int[] parent;
    private List<Integer> searchOrder;
    private Graph<V> graph;

    public SearchTree(int root, int[] parent, List<Integer> searchOrder, Graph<V> graph) {
      this.root = root;
      this.parent = parent;
      this.searchOrder = searchOrder;
      this.graph = graph;
    }

    public SearchTree(int root2, int[] parent2, List<Integer> searchOrder2) {
      // TODO Auto-generated constructor stub
    }

    public int getRoot() {
      return root;
    }

    public int getParent(int v) {
      return parent[v];
    }

    public List<Integer> getSearchOrder() {
      return searchOrder;
    }

    public int getNumberOfVerticesFound() {
      return searchOrder.size();
    }

    public List<V> getPath(int index) {
      List<V> path = new ArrayList<>();
      do {
        path.add(graph.getVertex(index));
        index = parent[index];
      } while (index != -1);
      return path;
    }

    public void printPath(int index) {
      List<V> path = getPath(index);
      System.out.print("A path from " + graph.getVertex(root) + " to " +
          graph.getVertex(index) + ": ");
      for (int i = path.size() - 1; i >= 0; i--) {
        System.out.print(path.get(i) + " ");
      }
      System.out.println();
    }

    public void printTree() {
      for (int rootIndex = 0; rootIndex < vertices.size(); rootIndex++) {
        System.out.println("Root is: " + vertices.get(rootIndex));
        System.out.print("Edges: ");
        for (int i = 0; i < parent.length; i++) {
          if (parent[i] != -1) { // Check if there is a parent, meaning there's an edge
            System.out.print("(" + vertices.get(parent[i]) + ", " + vertices.get(i) + ") ");
          }
        }
        System.out.println("\n"); // Newline for better separation
      }
    }
  }

  public class GraphTest {
    public static void main(String[] args) {
      Integer[] vertices = { 0, 1, 2, 3, 4 }; // Vertices of your graph
      int[][] edges = {
          { 0, 1 }, { 0, 4 }, { 4, 2 }, { 4, 3 }, { 3, 2 } // Edges of your graph
      };

      // Creating the graph with vertices and edges
      Graph<Integer> graph = new UnweightedGraph<>(vertices, edges);

      // Perform DFS from vertex 0
      UnweightedGraph<Integer>.SearchTree dfsTree = graph.dfs(0);
      System.out.println("DFS from vertex 0:");
      dfsTree.printTree();

      // Perform BFS from vertex 0
      UnweightedGraph<Integer>.SearchTree bfsTree = graph.bfs(0);
      System.out.println("BFS from vertex 0:");
      bfsTree.printTree();
    }
  }
}