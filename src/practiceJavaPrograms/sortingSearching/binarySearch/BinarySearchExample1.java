package practiceJavaPrograms.sortingSearching.binarySearch;

public class BinarySearchExample1 {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 12;
        System.out.println("Occurrence of "+target+" in array is on index : "+search(arr,target));
    }

    public static int search(int[] arr, int target) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
