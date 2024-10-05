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

    public boolean insert(int value) {
        if (isFull()) {
            return false;
        }

        data[endPointer++] = value;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is Empty!!");
        }

        for(int i = 0; i < endPointer - 1; i++) {
            data[i] = data[i + 1];
        }

        return data[0];
    }

    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot peek from an empty Queue!!");
        }

        return data[0];
    }

    public boolean isFull() {
        return endPointer == data.length;
    }

    public boolean isEmpty() {
        return endPointer == 0;
    }
}
