/*******************************************************************************
 * Kean University- Semester (Spring 2024)
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos CPS2232*02
 * Assignment- Lab 7
 *************************************************************************/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestBSTMillion {
  static class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
      key = item;
      left = right = null;
    }
  }

  static class BST {
    TreeNode root;

    BST() {
      root = null;
    }

    void insert(int key) {
      root = insertRec(root, key);
    }

    TreeNode insertRec(TreeNode root, int key) {
      if (root == null) {
        root = new TreeNode(key);
        return root;
      }
      if (key < root.key)
        root.left = insertRec(root.left, key);
      else if (key > root.key)
        root.right = insertRec(root.right, key);
      return root;
    }

    boolean search(int key) {
      return searchRec(root, key);
    }

    boolean searchRec(TreeNode root, int key) {
      if (root == null)
        return false;
      if (key == root.key)
        return true;
      return key < root.key ? searchRec(root.left, key) : searchRec(root.right, key);
    }
  }

  public static void main(String[] args) {
    int N = 1000000;
    List<Integer> values = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      values.add(i);
    }
    Collections.shuffle(values);

    BST bst = new BST();
    long startTime = System.nanoTime();
    for (int value : values) {
      bst.insert(value);
    }
    long endTime = System.nanoTime();
    long bstInsertTime = endTime - startTime;

    Collections.shuffle(values);
    int searchValue = values.get(0);

    startTime = System.nanoTime();
    bst.search(searchValue);
    endTime = System.nanoTime();
    long bstSearchTime = endTime - startTime;

    System.out.println("BST Insert Time: " + bstInsertTime + " ns");
    System.out.println("BST Search Time: " + bstSearchTime + " ns");
  }
}
