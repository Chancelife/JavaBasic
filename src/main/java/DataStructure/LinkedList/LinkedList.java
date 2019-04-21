package DataStructure.LinkedList;

public class LinkedList<E> {
    private Node<E> head;
    private Node<E> tail;

    private int size;

    public LinkedList() {
        head = new Node<E>();
        tail = head;
        size = 0;
    }

    public void add(E element) {
        addToLast(element);
    }

    public void add(int index, E element) {
        if(index<0 || index > this.size+1) {
            throw new IndexOutOfBoundsException();
        }
        Node curr = head.next, prev = head;
        while(index>0) {
            prev = curr;
            curr = curr.next;
            index--;
        }
        prev.next = new Node(element);
        prev.next.next = curr;
        this.size++;
    }

    public void addToLast(E element) {
        tail.next = new Node(element);
        tail = tail.next;
        size++;
    }

    public boolean remove(E value) {
        Node temp = head.next;
        Node prev = head;
        while(temp!=null) {
            if(temp.item.equals(value)) {
                while(temp.item.equals(value)) {
                    this.size--;
                    temp = temp.next;
                }
                prev.next = temp;
                return true;
            }
            prev = temp;
            temp = temp.next;
        }
        return false;
    }

    public Node<E> remove(int index) {
        if(index<0 || index>size)
            throw new IndexOutOfBoundsException();
        Node temp = head.next;
        Node prev = head;
        while(temp!=null && index>=0) {
            if(index==0) {
                prev.next = temp.next;
                this.size--;
                return temp;
            }
            prev = temp;
            temp = temp.next;
            index--;
        }
        return null;
    }

    public void print() {
        Node temp = head.next;
        while(temp!=null) {
            System.out.print(temp.item);
            System.out.print("->");
            temp = temp.next;
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}
