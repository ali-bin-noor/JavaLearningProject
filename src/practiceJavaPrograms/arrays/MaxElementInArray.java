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

        //shallow copy of array
        int[] shallow = arr;

        //if you are making changes in shallow copy then it will change in original array
        //shallow copy means we will have another reference to the array just like objects we have
        shallow[1] = 10;


        //deep copy of aaray
        int[] deep = Arrays.copyOf(arr,arr.length);
        System.out.println(arr);
        System.out.println(deep);
    }
}
