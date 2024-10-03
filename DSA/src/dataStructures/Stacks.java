package dataStructures;

public class Stacks {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int pointer = -1;

    public Stacks() {
        this(DEFAULT_SIZE);
    }

    public Stacks(int size) {
        this.data = new int[size];
    }

    public boolean push(int value) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is Full!!");
        }

        pointer++;
        data[pointer] = value;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty!!");
        }

        int removedElement = data[pointer];
        pointer--;
        return removedElement;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek from an empty Stack!!");
        }

        return data[pointer];
    }

    private boolean isFull() {
        return pointer == data.length - 1;
    }

    private boolean isEmpty() {
        return pointer == -1;
    }
}
