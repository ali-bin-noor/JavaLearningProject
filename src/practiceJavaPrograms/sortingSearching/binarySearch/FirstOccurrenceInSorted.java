package practiceJavaPrograms.sortingSearching.binarySearch;

public class FirstOccurrenceInSorted {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5};
        int target = 1;
        System.out.println("First Occurrence of "+target+" in array is on index : "+firstSearch(arr,target));
    }

    public static int firstSearch(int[] arr, int target) {
        //1 1 1 2 2 3 3 3 3 3 3 4 4 4 5 5 5
        int left = 0, right = arr.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                index = mid;
                right = mid - 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return index;
    }
}
