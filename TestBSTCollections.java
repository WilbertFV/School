import java.util.Collections;

public class TestBSTCollections {
  public static void main(String[] args) {
      BST<Integer> bst = new BST<>();
      // Populate bst with your Kean ID digits, avoiding duplicates
      bst.insert(1); bst.insert(2); bst.insert(2); bst.insert(8); bst.insert(0); bst.insert(6); bst.insert(8);

      System.out.println("Value of maximum element in the tree is: " + Collections.max(bst));
      System.out.println("Value of minimum element in the tree is: " + Collections.min(bst));
      System.out.println("Frequency of 8 in the tree: " + Collections.frequency(bst, 8));
  }
}
