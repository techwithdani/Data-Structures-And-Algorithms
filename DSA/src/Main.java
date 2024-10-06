import dataStructures.*;

public class Main {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(6);

        queue.insert(2);
        queue.insert(4);
        queue.insert(6);
        queue.insert(8);
        queue.insert(10);
        queue.insert(12);

        queue.display();

        queue.remove();

        queue.insert(55);
        System.out.println(queue.peek());

        queue.display();
    }
}
