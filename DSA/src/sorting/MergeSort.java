package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {88, 77, 66, 55, 44, 33, 22, 11, -20, -1, -4, -5, 87, 555, 222, 1, 2, 0, 99};

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

    }
}
