package dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(2);
        queue.add(6);
        queue.add(8);
        queue.add(10);
        queue.add(22);
        queue.add(44);

        System.out.println(queue.peek());
        queue.remove();
        queue.remove();
        System.out.println(queue.peek());
    }
}
