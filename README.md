
## Binary Search Tree (BST) for Person Objects

This project provides a generic implementation of a Binary Search Tree (BST) in Java. It utilizes the BST to store and manipulate `Person` objects using their age as a key.

### Features

- **Generic**: The BST is designed to be used with any type that implements the `Comparable` interface.
- **Basic Operations**: Insert, search, and traverse (in-order) elements in the BST.
- **Usage with Person Objects**: The provided example demonstrates using the BST to store `Person` objects and perform operations based on their age.

### How to Use

1. **Create a BST**:
```java
BinaryTree<Person> personTree = new BinaryTree<>();
```

2. **Add people to the BST**:
```java
personTree.add(new Person("Alice", 25));
personTree.add(new Person("Bob", 30));
```

3. **Search for a person by age**:
```java
Person searchPerson = new Person("", 30);
boolean exists = personTree.search(searchPerson);
```

4. **Perform an in-order traversal**:
```java
personTree.inOrderTraversal();
```

### Dependencies

- Java SE Development Kit (JDK) version 8 or later.

### Installation and Running

1. Clone this repository or download the source code.
2. Compile the Java classes using the `javac` command.
3. Run the main class `PersonTree` to see the BST in action.

### Authors

- Makhlouf Hennine
