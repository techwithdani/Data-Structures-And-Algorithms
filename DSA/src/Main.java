public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10000];
        int target = 5454;

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        int result = searchNumber(numbers, target);

        if (result == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println(target + " found at " + result + " index");
        }

    }

    public static int searchNumber(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int value = array[mid];

            if (value < target) {
                start = mid + 1;
            } else if (value > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}