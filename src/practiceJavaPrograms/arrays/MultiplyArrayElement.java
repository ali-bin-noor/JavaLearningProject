package practiceJavaPrograms.arrays;

public class MultiplyArrayElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        multiplyArrayElement(arr);
    }

    private static void multiplyArrayElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + 10;
            } else {
                arr[i] = arr[i] * 2;
            }
        }
        for (int element : arr) {
            System.out.print(element + " ");

        }
    }
}
