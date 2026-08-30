package practiceJavaPrograms.arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {20, 42, 20, 6, 6, 25, 6, 88, 20, 20, 20, 6, 7};
        System.out.println("Second smallest number is : " + returnSecondSmallestNumber(arr));
    }

    public static int returnSecondSmallestNumber(int[] arr) {
        int small = 0;
        int secondSmall = 0;
        if (arr[0] < arr[1]) {
            small = arr[0];
            secondSmall = arr[1];
        } else {
            small = arr[1];
            secondSmall = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            } else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }

        return secondSmall;
    }
}
