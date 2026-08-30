package practiceJavaPrograms.arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;
        System.out.println(twoSum(arr,target));
    }

    public static boolean twoSum(int arr[], int target) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
