import dataStructures.*;

public class Main {
    public static void main(String[] args) {
         CircularLinkedListLL list = new CircularLinkedListLL();

         list.insert(11);
         list.insert(22);
         list.insert(33);
         list.insert(44);
         list.insert(55);

         list.display();

         list.delete(33);

         list.display();
    }
}
