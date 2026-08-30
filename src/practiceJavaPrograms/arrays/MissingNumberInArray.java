package practiceJavaPrograms.arrays;

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println("Missing number is : "+missingNum(arr));

    }
    private static long missingNum(int arr[]) {

        long n = arr.length+1;
        long sum = n*(n+1)/2;
        long arraySum = 0;
        for(int ele : arr){
             arraySum += ele;
        }
        return sum-arraySum;
    }
}
