package practiceJavaPrograms.arrays;

import java.util.Arrays;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {14, 23, 454, 21, -11, 65, -12, -76, 98, -99};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            /*if(arr[i] > max){
                max = arr[i];
            }*/
            max = Math.max(arr[i], max);
        }
        System.out.println("Max element in the array : " + max);

        int[] deep = Arrays.copyOf(arr,arr.length);
        System.out.println(arr);
        System.out.println(deep);
    }
}
