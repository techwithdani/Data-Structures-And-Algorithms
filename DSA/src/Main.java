import dataStructures.LinkedListLL;

public class Main {
    public static void main(String[] args) {
        LinkedListLL linkedList = new LinkedListLL();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);

        linkedList.display();
    }
}
