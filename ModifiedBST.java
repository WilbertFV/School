import java.util.Iterator;
import java.util.Stack;


public class ModifiedBST<E extends Comparable<E>> implements Iterable<E> {
    protected TreeNode<E> root;
    protected int size = 0;
    
    // Constructors and other methods...
        /** Create a default binary search tree */
    public ModifiedBST() {
    }

    /** Create a binary search tree from an array of objects */
    public ModifiedBST(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    /** Insert element e into the binary search tree.
     * Return true if the element is inserted successfully. */
    public boolean insert(E e) {
        if (root == null) {
            root = new TreeNode<>(e); // Create a new root
        } else {
            // Locate the parent node
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false; // Duplicate node not inserted
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = new TreeNode<>(e);
            } else {
                parent.right = new TreeNode<>(e);
            }
        }
        size++;
        return true; // Element inserted successfully
    }

    /** Inorder traversal from the root */
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    /** This inner class is static, because it does not access 
        any instance members defined in its outer class */
    public static class TreeNode<E> {
        E element;
        TreeNode<E> left;
        TreeNode<E> right;

        public TreeNode(E element) {
            this.element = element;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new BSTIterator(root);
    }

    private class BSTIterator implements Iterator<E> {
        // Stack to hold the nodes
        private Stack<TreeNode<E>> stack = new Stack<>();

        public BSTIterator(TreeNode<E> root) {
            pushAll(root);
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public E next() {
            TreeNode<E> node = stack.pop();
            pushAll(node.right);
            return node.element;
        }

        private void pushAll(TreeNode<E> node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
    }

    // BST Node definition

        
    }

