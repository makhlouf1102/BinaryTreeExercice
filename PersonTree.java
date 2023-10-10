import binaryTree.*;

public class PersonTree {
    public static void main(String[] args) {
        BinaryTree<Person> personTree = new BinaryTree<>();

        personTree.add(new Person("Alice", 25));
        personTree.add(new Person("Bob", 30));
        personTree.add(new Person("Charlie", 20));
        personTree.add(new Person("David", 28));

        Person searchPerson = new Person("", 12);
        System.out.println("Is person of age 12 present? " + personTree.search(searchPerson));

        System.out.println("In-order traversal:");
        personTree.inOrderTraversal();
    }
}
