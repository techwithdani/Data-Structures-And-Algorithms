package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {88, 77, 66, 55, 44, 33, 22, 11, 87, 555, 222, 1, 2, 0};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
