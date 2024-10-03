import dataStructures.*;

public class Main {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(4);

        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        stack.push(18);
        stack.push(19);
        stack.push(120);
        stack.push(1212);

        System.out.println(stack.peek());
    }
}
