package practiceJavaPrograms.basicPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();//256

        int reverse = 0;
        while (n != 0) {
            reverse = (reverse * 10) + n % 10;
            n /= 10;
        }
        System.out.println("Reverse of number is : " + reverse);
    }
}
