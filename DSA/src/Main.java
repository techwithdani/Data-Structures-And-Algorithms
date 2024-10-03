import dataStructures.*;

public class Main {
    public static void main(String[] args) throws StackException {
         Stacks customStack = new Stacks(5);

         customStack.push(44);
         customStack.push(55);
         customStack.push(66);
         customStack.push(88);
         customStack.push(99);

         System.out.println(customStack.pop());
         System.out.println(customStack.peek());
    }
}
