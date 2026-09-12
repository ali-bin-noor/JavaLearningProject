package practiceJavaPrograms.sortingSearching.binarySearch;

public class SingleAmongDoublesInASorted {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 6, 50, 50, 65, 65};
        System.out.println("Single element is  : " + singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return arr[0];
        if (arr[0] != arr[1])
            return arr[0];
        if (arr[n - 1] != arr[n - 2])
            return arr[n - 1];
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid - 1] != arr[mid] && arr[mid] != arr[mid + 1])
                return arr[mid];
            int f = mid, s = mid;
            if (arr[mid - 1] == arr[mid])
                f = mid - 1;
            else
                s = mid + 1;
            int leftCount = f - left; //rightCount = right - s;
            if (leftCount % 2 == 0) {
                left = s + 1;
            } else {
                right = f;
            }
        }

        return -1;
    }
}
