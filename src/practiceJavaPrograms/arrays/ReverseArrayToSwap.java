package practiceJavaPrograms.arrays;

public class ReverseArrayToSwap {
    public static void main(String[] args) {

        int[] arr = {14, 23, 454, 21, -11, 65, -12, -76, 98, -99};
        for (int element : arr) {
            System.out.print(element + " ");
        }

        //ye for loop se bhi kar skte hain
        /*for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }*/

        //ye for loop se bhi kar skte hain
       /* for(int i=0;i< arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
            i++;
        }*/

        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println();
        for (int element : arr) {
            System.out.print(element + " ");
        }

    }

}
