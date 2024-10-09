import dataStructures.*;

public class Main {
    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue(5);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.insert(10);

        queue.display();
    }
}
