package practiceJavaPrograms.arrays;

import java.util.Arrays;

public class SortArrayBuiltin {
    public static void main(String[] args) {
        //sort - ascending order
        int[] arr = {4,1,5,3,6,2,4,7,3,-3};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    private static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
