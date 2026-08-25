package practiceJavaPrograms.arrays;

public class NegativeArray {
    public static void main(String[] args) {
        int[] arr = {14, 23, 454, 21, -11, 65, -12, -76, 98, -99};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
