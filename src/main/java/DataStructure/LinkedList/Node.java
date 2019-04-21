package DataStructure.LinkedList;

public class Node<E> {
    E item;
    Node next;
    public Node() {}

    public Node(E value) {
        this.item = value;
    }

    public String toString() {
        return this.item.toString();
    }
}
