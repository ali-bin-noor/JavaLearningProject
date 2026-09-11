package practiceJavaPrograms.sortingSearching.binarySearch;

public class LastOccurrenceInSorted {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5};
        int target = 3;
        System.out.println("Last Occurrence of "+target+" in array is on index : "+lastSearch(arr,target));
    }

    public static int lastSearch(int[] arr, int target) {
        //1 1 1 2 2 3 3 3 3 3 3 4 4 4 5 5 5
        int left = 0, right = arr.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                index = mid;
                left = mid + 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return index;
    }
}
