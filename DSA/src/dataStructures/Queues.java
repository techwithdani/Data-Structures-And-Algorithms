package dataStructures;

public class Queues {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int endPointer = 0;

    public Queues() {
        this(DEFAULT_SIZE);
    }

    public Queues(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return endPointer == data.length;
    }

    public boolean isEmpty() {
        return endPointer == 0;
    }
}
