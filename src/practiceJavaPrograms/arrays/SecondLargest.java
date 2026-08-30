package practiceJavaPrograms.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        //int[] arr = {10,50,44,48,47,48,10,100,59,878,524,217,217,878,68,458,17,5478,546};
        int[] arr = {20,42,6,25,30,88};
        /*int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for (int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }

        System.out.println("Second largest number is : "+smax);*/
        System.out.println("Second largest number is : "+returnSecondLargestNumber(arr));
    }

    public static int returnSecondLargestNumber(int[] arr){
        int max = 0;
        int smax = 0;
        if(arr[0]>arr[1]){
            max = arr[0];
            smax = arr[1];
        } else {
            max = arr[1];
            smax = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax){
                smax=arr[i];
            }
        }

        return smax;
    }
}
