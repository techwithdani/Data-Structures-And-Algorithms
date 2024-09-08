public class Main {
    public static void main(String[] args) {
        int[] numbers = {9, 7, 5, 8, 2, 1, 0};

        mergeSort(numbers, 0, numbers.length - 1);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void mergeSort(int[] data, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    public static void merge(int[] data, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (data[i] <= data[j]) {
                temp[k] = data[i];
                i++;
            } else {
                temp[k] = data[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = data[i];
            i++;
            k++;
        }

        while (j <= end) {
            temp[k] = data[j];
            j++;
            k++;
        }

        for (i = start; i <= end; i++) {
            data[i] = temp[i - start];
        }
    }

}