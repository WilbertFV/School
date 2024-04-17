/*******************************************************************************
 * Kean University- Semester (Spring 2024)
 * Course: CPS*2232*02 - Data Structures
 * Author(s): Wilbert Villalobos CPS2232*02
 * Assignment- Lab 7
 *************************************************************************/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestAVLTreeMillion {
  static class TreeNode {
    int key, height;
    TreeNode left, right;

    TreeNode(int d) {
      key = d;
      height = 1;
    }
  }

  static class AVLTree {
    TreeNode root;

    int height(TreeNode N) {
      if (N == null)
        return 0;
      return N.height;
    }

    TreeNode rightRotate(TreeNode y) {
      TreeNode x = y.left;
      TreeNode T2 = x.right;
      x.right = y;
      y.left = T2;
      y.height = Math.max(height(y.left), height(y.right)) + 1;
      x.height = Math.max(height(x.left), height(x.right)) + 1;
      return x;
    }

    TreeNode leftRotate(TreeNode x) {
      TreeNode y = x.right;
      TreeNode T2 = y.left;
      y.left = x;
      x.right = T2;
      x.height = Math.max(height(x.left), height(x.right)) + 1;
      y.height = Math.max(height(y.left), height(y.right)) + 1;
      return y;
    }

    int getBalance(TreeNode N) {
      if (N == null)
        return 0;
      return height(N.left) - height(N.right);
    }

    TreeNode insert(TreeNode node, int key) {
      if (node == null)
        return (new TreeNode(key));
      if (key < node.key)
        node.left = insert(node.left, key);
      else if (key > node.key)
        node.right = insert(node.right, key);
      else
        return node;

      node.height = 1 + Math.max(height(node.left), height(node.right));
      int balance = getBalance(node);

      if (balance > 1 && key < node.left.key)
        return rightRotate(node);
      if (balance < -1 && key > node.right.key)
        return leftRotate(node);
      if (balance > 1 && key > node.left.key) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
      }
      if (balance < -1 && key < node.right.key) {
        node.right = rightRotate(node.right);
        return leftRotate(node);
      }
      return node;
    }

    void insert(int key) {
      root = insert(root, key);
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

    AVLTree avl = new AVLTree();
    long startTime = System.nanoTime();
    for (int value : values) {
      avl.insert(value);
    }
    long endTime = System.nanoTime();
    long avlInsertTime = endTime - startTime;

    Collections.shuffle(values);
    int searchValue = values.get(0);

    startTime = System.nanoTime();
    avl.search(searchValue);
    endTime = System.nanoTime();
    long avlSearchTime = endTime - startTime;

    System.out.println("AVL Insert Time: " + avlInsertTime + " ns");
    System.out.println("AVL Search Time: " + avlSearchTime + " ns");
  }
}
