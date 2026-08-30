package practiceJavaPrograms.arrays;


import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 30, 60};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check in array: ");
        int number = sc.nextInt();
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
               position = i;
                break;
            }
        }
        if (position!=-1)
            System.out.println("Number is present in the array and found at " + position + " position.");
        else
            System.out.println("Number is not present in the array.");
    }
}
