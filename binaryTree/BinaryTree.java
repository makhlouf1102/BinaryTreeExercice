package binaryTree;

public class BinaryTree<T extends Comparable<T>> {
    private TreeNodeABR<T> root ;

    public BinaryTree() {
        this.root = null;
    }


    public void add(T value) {
        this.root = addRecursive(root, value);
    }

    private TreeNodeABR<T> addRecursive(TreeNodeABR<T> current, T value) {
        if (current == null) {
            System.out.println("Inserting: " + value);
            return new TreeNodeABR<T>(value);
        }

        if (value.compareTo(current.value) < 0 ) {
            current.left = addRecursive(current.left, value);
        } else if (value.compareTo(current.value) > 0 ) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }
    public boolean search(T value) {
        return searchRecursive(root, value);
    }
    private boolean searchRecursive(TreeNodeABR<T> current, T value) {
        if (current == null) {
            return false;
        }

        if (value.compareTo(current.value) == 0 ) {
            return true;
        } else if (value.compareTo(current.value) > 0 ) {
            return searchRecursive(current.right, value);
        } else {
            return searchRecursive(current.left, value);
        }
    }
    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    private void inOrderTraversalRecursive(TreeNodeABR<T> current) {
        if (current != null) {
            inOrderTraversalRecursive(current.left);
            System.out.println(current.value);
            inOrderTraversalRecursive(current.right);
        }
    }
}
