package practiceJavaPrograms.sortingSearching.binarySearch;

import java.util.ArrayList;

public class FirstAndLastInSorted {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5};
        int target = 3;
        System.out.println(find(arr, target));


    }

    private static ArrayList<Integer> find(int arr[], int target) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int left = 0, right = arr.length - 1, index = -1, mid = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                index = mid;
                right = mid - 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        ans.add(index);

        left = 0;
        right = arr.length - 1;
        index = -1;
        mid = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                index = mid;
                left = mid + 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        ans.add(index);
        return ans;

    }
}
