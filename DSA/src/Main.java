import dataStructures.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Queues queue = new Queues(6);

        queue.insert(9);
        queue.insert(8);
        queue.insert(7);
        queue.insert(6);
        queue.insert(1);
        queue.insert(10);

        queue.display();

        System.out.println(queue.peek());
        System.out.println(queue.remove());

        System.out.println(queue.peek());
        System.out.println(queue.remove());

        System.out.println(queue.peek());
        System.out.println(queue.remove());

        System.out.println(queue.peek());
        System.out.println(queue.remove());

        System.out.println(queue.peek());
        System.out.println(queue.remove());

        System.out.println(queue.peek());
        System.out.println(queue.remove());

        queue.display();
    }
}
