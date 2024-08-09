public class Main {
    public static void main(String[] args) {
        int[] num = {6, 7, 8, 9, 4, 3, 2, 1, 33, 56, 666, 66666, 7567, 435, 34};

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }
            }
        }

        for (int j : num) {
            System.out.print(j + " ");
        }
    }
}