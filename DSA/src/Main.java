import dataStructures.*;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedListLL list = new DoublyLinkedListLL();

        list.insertFirst(22);
        list.insertFirst(54);
        list.insertFirst(87);
        list.insertFirst(4);
        list.insertFirst(5);

        list.insertLast(44);
        list.insertLast(55);

        list.insert(22, 6);

        list.display();
    }
}
