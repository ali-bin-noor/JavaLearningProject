package practiceJavaPrograms.arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {14, 234, 65, -23, -45, -34, 12, 45, -5, 56, 34, 12, 65};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of array is : " + sum);
    }
}
