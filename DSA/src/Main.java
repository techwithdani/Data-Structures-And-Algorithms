public class Main {
    public static void main(String[] args) {
        int[] numbers = {9, 7, 5, 8, 2, 1, 0};

        quickSort(numbers, 0, numbers.length - 1);

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] data, int start, int end) {
        if (start < end) {
            int pivot = partition(data, start, end);

            quickSort(data, start, pivot - 1);
            quickSort(data, pivot + 1, end);
        }
    }

    public static int partition(int[] data, int start, int end) {
        int pivot = data[end];
        int i = start - 1;
        int temp;

        for (int j = start; j < end; j++) {
            if (data[j] < pivot) {
                i++;
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        i++;

        temp = data[i];
        data[i] = data[end];
        data[end] = temp;

        return i;
    }
}