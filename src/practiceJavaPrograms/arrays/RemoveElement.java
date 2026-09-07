package practiceJavaPrograms.arrays;

//this is not solved yet need to work on this
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int k = removeElement(nums,2);
        System.out.print("k : "+k);
        System.out.println();
        for(int element : nums){
            System.out.print(element+" ");
        }
    }



    public static int removeElement(int[] nums, int val) {

        int n = nums.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }

        return k;
    }
}
