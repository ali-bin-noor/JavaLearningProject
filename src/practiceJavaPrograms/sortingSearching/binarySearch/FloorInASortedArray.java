package practiceJavaPrograms.sortingSearching.binarySearch;

public class FloorInASortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 11;
        System.out.println("Floor index : " + findFloor(arr,target));

    }

    static int findFloor(int[] arr, int target) {
        int left = 0, right = arr.length - 1, index = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target)
                right = mid - 1;
            else{ //arr[mid] <= target
                index = mid;
                left = mid + 1;
            }
        }

        return index;
    }
}
