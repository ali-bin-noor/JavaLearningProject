package practiceJavaPrograms.sortingSearching.binarySearch;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public static void main(String[] args) {
        int[] arr = {-2,-1,-1,1,2,3};
        System.out.println("Maximum count is : "+maximumCount(arr));
    }

    public static int maximumCount(int[] arr) {
        int left = 0, right = arr.length - 1;
        int countOfNonNegative = 0;
        int countOfNegative = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == 0) {
                left = mid + 1;
            } else if (arr[mid] > 0) {
                countOfNonNegative++;
                left++;
            }else{//arr[mid] < 0
                left = mid + 1;
            }
        }
        left = 0; right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == 0) {
                right = mid - 1;
            } else if (arr[mid] < 0) {
                countOfNegative++;
                right--;
            }
        }


        return Math.max(countOfNonNegative,countOfNegative);
    }
}
