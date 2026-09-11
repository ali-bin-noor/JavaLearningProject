package practiceJavaPrograms.sortingSearching.bubbleSort;

public class DescendingOrderArray {
    public static void main(String[] args) {
        int[] arr = {5, -2, 4, 6, 3, 1, 5, 7, 2, 0};
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
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
