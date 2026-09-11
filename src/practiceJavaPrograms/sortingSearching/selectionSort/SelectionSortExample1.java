package practiceJavaPrograms.sortingSearching.selectionSort;

//Selection sort me hamesha strating is sorting hoti hai
//min find karke starting se replcae krna hota hai
public class SelectionSortExample1 {
    public static void main(String[] args) {
        int[] arr = {5, -2, 4, 6, 3, 1, 5, 7, 2, 0};
        print(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
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
