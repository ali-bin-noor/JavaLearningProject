package practiceJavaPrograms.arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8, 9, 10, 15};
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
        sortInWave(arr);

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void sortInWave(int arr[]) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
