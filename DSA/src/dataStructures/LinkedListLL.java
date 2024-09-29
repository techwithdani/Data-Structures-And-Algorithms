package dataStructures;

public class LinkedListLL {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertRandom(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        temp.next = new Node(val, temp.next);

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        int val = tail.value;
        tail = get(size - 2);
        tail.next = null;

        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.print("END");
    }

    private static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
