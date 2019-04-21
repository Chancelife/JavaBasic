package DataStructure.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest{

    @Test
    public void nodeTest() {
        Node<String> node = new Node<>("Happy");
        assertEquals("Happy", node.item);
    }

    @Test
    public void addTest() {
        LinkedList<String> list = new LinkedList<>();
        list.add("H");
        list.add("E");
        list.add("L");
        list.add("L");
        list.add("O");
        list.add("!");
        list.print();
        list.add(4, "P");
        list.add(5, "A");
        list.add(6, "S");
        list.add(6, "T");
        list.print();
    }
}
