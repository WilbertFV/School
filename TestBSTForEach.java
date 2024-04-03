public class TestBSTForEach {
  public static void main(String[] args) {
      BST<Integer> bst = new BST<>();
      // Assuming bst is filled with elements
      
      bst.insert(1); bst.insert(2); bst.insert(2); bst.insert(8); bst.insert(0); bst.insert(6); bst.insert(8);
      
      for (Integer value : bst) {
          System.out.println(value);
      }
  }
}
