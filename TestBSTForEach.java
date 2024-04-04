/*******************************************************************************
 * Kean University- Semester (Spring 2024)
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos CPS2232*02
 * Assignment- HW 6
 *************************************************************************/

public class TestBSTForEach {
  public static void main(String[] args) {
    BST<Integer> bst = new BST<>();

    bst.insert(1);
    bst.insert(2);
    bst.insert(2);
    bst.insert(8);
    bst.insert(0);
    bst.insert(6);
    bst.insert(8);

    for (Integer value : bst) {
      System.out.println(value);
    }
  }
}
