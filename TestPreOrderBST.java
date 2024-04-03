public class TestPreOrderBST {
  public static void main(String[] args) {
      // Create a BST from an array of Integer elements
      Integer[] elements = {1,2,2,8,0,6,8};
      BST<Integer> bst = new BST<>(elements);

      // Display the BST in inorder to show the elements are in the tree
      System.out.println("BST in inorder:");
      bst.inorder();
      System.out.println("\n");

      // Use the PreorderIterator to display elements in preorder
      System.out.println("BST in preorder using PreorderIterator:");
      for (Integer element : bst) {
          System.out.print(element + " ");
      }
      System.out.println();

      // Inserting a new element and showing the preorder traversal again
      System.out.println("After inserting 25:");
      bst.insert(25);
      for (Integer element : bst) {
          System.out.print(element + " ");
      }
      System.out.println();

      // Removing an element and showing the preorder traversal again
      System.out.println("After deleting 60:");
      bst.delete(60);
      for (Integer element : bst) {
          System.out.print(element + " ");
      }
      System.out.println();
  }
}
