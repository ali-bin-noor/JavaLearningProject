package practiceJavaPrograms.sortingSearching.binarySearch;
/*
* Given an array arr[] of distinct elements, which was initially sorted in ascending order but then rotated at some unknown pivot, the task is to find the index of a target key.  If the key is not present in the array, return -1.

Examples :

Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
Output: 8
Explanation: 3 is found at index 8.
Input: arr[] = [3, 5, 1, 2], key = 6
Output: -1
Explanation: There is no element that has value 6.
Input: arr[] = [33, 42, 72, 99], key = 42
Output: 1
Explanation: 42 is found at index 1.
Constraints:

1 ≤ arr.size() ≤ 106
0 ≤ arr[i], key ≤ 106
*
*
* */
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("target element index is  : " + search(arr, target));
    }

    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[left] <= arr[mid]) {
                if (arr[left] <= target && target < arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (arr[mid] < target && target <= arr[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }

        }

        return -1;
    }
}
