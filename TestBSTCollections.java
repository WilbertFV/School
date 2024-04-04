
/*******************************************************************************
 * Kean University- Semester (Spring 2024)
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos CPS2232*02
 * Assignment- HW 6
 *************************************************************************/

import java.util.Collections;

public class TestBSTCollections {
  public static void main(String[] args) {
    BST<Integer> bst = new BST<>();
    bst.insert(1);
    bst.insert(2);
    bst.insert(2);
    bst.insert(8);
    bst.insert(0);
    bst.insert(6);
    bst.insert(8);

    System.out.println("Value of maximum element in the tree is: " + Collections.max(bst));
    System.out.println("Value of minimum element in the tree is: " + Collections.min(bst));
    System.out.println("Frequency of 8 in the tree: " + Collections.frequency(bst, 8));
  }
}
