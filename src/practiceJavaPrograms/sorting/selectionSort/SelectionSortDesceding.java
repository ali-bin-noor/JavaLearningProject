package practiceJavaPrograms.sorting.selectionSort;

public class SelectionSortDesceding {
    public static void main(String[] args) {
        int[] arr = {5, -2, 4, 6, 3, 1, 5, 7, 2, 0};
        print(arr);

        for (int i = arr.length - 1; i > 0; i--) {
            int max = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        print(arr);
    }

    private static void print(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
