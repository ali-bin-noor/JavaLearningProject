package practiceJavaPrograms.sortingSearching.binarySearch;

public class PeakElementMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("index : " + peakElement(arr));
    }

    public static int peakElement(int[] arr) {
        int left = 1, right = arr.length - 2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((arr[mid] > arr[mid - 1]) && (arr[mid] > arr[mid + 1]))
                return mid;
            else if ((arr[mid] > arr[mid - 1]) && (arr[mid] < arr[mid + 1])) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }
}
