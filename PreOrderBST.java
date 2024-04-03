import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class PreOrderBST<E extends Comparable<E>> implements Tree<E> {
    protected TreeNode<E> root;
    protected int size = 0;
    protected java.util.Comparator<E> c;

    /** Create a default BST with a natural order comparator */
    public PreOrderBST() {
        this.c = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
    }

    /** Create a BST with a specified comparator */
    public PreOrderBST(java.util.Comparator<E> c) {
        this.c = c;
    }

    /** Create a binary tree from an array of objects */
    public PreOrderBST(E[] objects) {
        for (E object : objects) {
            insert(object);
        }
    }

    @Override
    public boolean search(E e) {
        TreeNode<E> current = root;
        while (current != null) {
            int comparison = c.compare(e, current.element);
            if (comparison < 0) {
                current = current.left;
            } else if (comparison > 0) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                int comparison = c.compare(e, current.element);
                if (comparison < 0) {
                    parent = current;
                    current = current.left;
                } else if (comparison > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false; // Duplicate node not inserted
                }
            }
            if (c.compare(e, parent.element) < 0) {
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true; // Element inserted successfully
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    protected void postorder(TreeNode<E> root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }

    @Override
    public void preorder() {
        preorder(root);
    }

    protected void preorder(TreeNode<E> root) {
        if (root == null) return;
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static class TreeNode<E> {
        E element;
        TreeNode<E> left;
        TreeNode<E> right;

        public TreeNode(E e) {
            element = e;
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    public TreeNode<E> getRoot() {
        return root;
    }

    // Other methods...

    @Override
    public Iterator<E> iterator() {
        return new PreorderIterator();
    }

    private class PreorderIterator implements Iterator<E> {
        private Stack<TreeNode<E>> stack = new Stack<>();

        public PreorderIterator() {
            if (root != null) {
                stack.push(root);
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            TreeNode<E> node = stack.pop();
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            return node.element;
        }
    }

    @Override
    public void clear() {
        root = null; // Remove all elements by setting root to null
        size = 0;    // Reset size to 0
    }
    

    @Override /** Delete an element from the binary tree.
    * Return true if the element is deleted successfully
    * Return false if the element is not in the tree */
   public boolean delete(E e) {
     // Locate the node to be deleted and also locate its parent node
     TreeNode<E> parent = null;
     TreeNode<E> current = root;
     while (current != null) {
       if (c.compare(e, current.element) < 0) {
         parent = current;
         current = current.left;
       }
       else if (c.compare(e, current.element) > 0) {
         parent = current;
         current = current.right;
       }
       else
         break; // Element is in the tree pointed at by current
     }
 
     if (current == null)
       return false; // Element is not in the tree
 
     // Case 1: current has no left child
     if (current.left == null) {
       // Connect the parent with the right child of the current node
       if (parent == null) {
         root = current.right;
       }
       else {
         if (c.compare(e, parent.element) < 0)
           parent.left = current.right;
         else
           parent.right = current.right;
       }
     }
     else {
       // Case 2: The current node has a left child
       // Locate the rightmost node in the left subtree of
       // the current node and also its parent
       TreeNode<E> parentOfRightMost = current;
       TreeNode<E> rightMost = current.left;
 
       while (rightMost.right != null) {
         parentOfRightMost = rightMost;
         rightMost = rightMost.right; // Keep going to the right
       }
 
       // Replace the element in current by the element in rightMost
       current.element = rightMost.element;
 
       // Eliminate rightmost node
       if (parentOfRightMost.right == rightMost)
         parentOfRightMost.right = rightMost.left;
       else
         // Special case: parentOfRightMost == current
         parentOfRightMost.left = rightMost.left;     
     }
 
     size--; // Reduce the size of the tree
     return true; // Element deleted successfully
   }
 
}
