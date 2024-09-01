package sorting;

public class BubbleSortStrings {
    public static void main(String[] args) {
        String[] names = {"Messi", "Tyson", "Ronaldo", "Ali", "Dani"};

        for (int i = 0; i < names.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < names.length - 1 - i; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        printArray(names);
    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
