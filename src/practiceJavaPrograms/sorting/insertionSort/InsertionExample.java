package practiceJavaPrograms.sorting.insertionSort;

public class InsertionExample {
    public static void main(String[] args) {
        int[] arr = {5, -2, 4, 6, 3, 1, 5, 7, 2, 0};
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
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
