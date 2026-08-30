package practiceJavaPrograms.arrays;

public class RotateArray {

    //Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps,
    //where d is a positive integer. Do the mentioned change in the array in place.
    public static void main(String[] args) {
        //this is using second array
        /*int[] arr = {6, 8, 1, 2, 4, 9, 0};
        int d = 3;.
        int index= 3;

        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            arr2[i] = arr[index];
            if (index== arr.length-1)
                index=0;
            else
                index++;

        }
         for (int element : arr2){
             System.out.print(element+" ");
         }*/

        //this is using same array
        int[] arr = {6, 8, 1, 2, 4, 9, 0};
        int d = 3;
        int n = arr.length;
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        //first way to do
        swapArray(arr, 0, d - 1);
        swapArray(arr, d, n - 1);
        swapArray(arr, 0, n - 1);

        //second way to do
        //arr = swapArray(arr,0,n-1);
        //arr = swapArray(arr, 0, n-1-d);
        //arr = swapArray(arr, n-d, n-1);


        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    private static void swapArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
