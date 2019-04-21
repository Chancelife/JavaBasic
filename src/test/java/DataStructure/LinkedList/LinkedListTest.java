package DataStructure.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest{

    @Test
    public void nodeTest() {
        Node<String> node = new Node<>("Happy");
        assertEquals("Happy", node.item);
        assertEquals("Happy", node.toString());
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
        assertEquals(6, list.size());
        list.add(4, "P");
        list.add(5, "A");
        list.add(6, "S");
        list.add(6, "T");
        list.print();
        assertEquals(10, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addThrowTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        assertEquals(1, list.size());
        list.add(3, 10);
    }

    @Test
    public void removeTest() {
        LinkedList<String> list = new LinkedList<>();
        list.add("H");
        list.add("E");
        list.add("L");
        list.add("L");
        list.add("O");
        list.add("!");
        list.print();
        assertEquals(true, list.remove("L"));
        assertEquals(false, list.remove("L"));
        list.print();
        assertEquals(4, list.size());
    }

    @Test
    public void removeIndexTest() {
        LinkedList<String> list = new LinkedList<>();
        list.add("H");
        list.add("E");
        list.add("L");
        list.add("L");
        list.add("O");
        list.add("!");
        assertEquals("H", list.remove(0).item);
        assertEquals(5, list.size());
        assertEquals("L", list.remove(2).item);
        assertEquals(4, list.size());
        assertEquals(null, list.remove(4));
        list.print();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeIndexThrowTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        assertEquals(3, list.size());
        list.remove(Integer.valueOf(5));
        list.print();
        list.remove(5);
    }
}
