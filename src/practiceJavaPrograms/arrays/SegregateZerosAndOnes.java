package practiceJavaPrograms.arrays;

public class SegregateZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregate0and1(arr);
        for(int element : arr){
            System.out.print(element+" ");
        }

    }

    public static void segregate0and1(int[] arr) {
        /*int numberOfZeroes = 0;
        int numberOfOnes = 0;

        for(int element : arr){
            if(element == 0){
                numberOfZeroes++;
            }else{
                numberOfOnes++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(i<numberOfZeroes){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }*/

       int start = 0 , end = arr.length-1;
       while(start<end){
           if(arr[start]==1 && arr[end]==0){
               int temp = arr[start] ;
               arr[start]= arr[end];
               arr[end] = temp;
               start++;
               end--;
           }else if(arr[start]==0 && arr[end]==1){
               start++;
               end--;
           }else if(arr[start]==0 && arr[end]==0){
               start++;
           }else{
               end--;
           }
       }

    }
}
