package practiceJavaPrograms.sortingSearching.binarySearch;

public class DescendingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {100, 85, 70, 55, 40, 25, 10};
        int target = 10;
        System.out.println("Occurrence of "+target+" in descending array is on index : "+binarySearch(arr,target));

    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0 , right = arr.length - 1;
        while (left<=right){
            int mid = (left + right )/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }

        }

        return -1;
    }
}
