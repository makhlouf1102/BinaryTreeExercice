package binaryTree;

public class TreeNodeABR<T extends Comparable<T>> {
    T value;
    TreeNodeABR<T> left;
    TreeNodeABR<T> right;

    public TreeNodeABR(T value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }


}
