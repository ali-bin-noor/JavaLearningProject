package practiceJavaPrograms.basicPrograms;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {

        //print arithmetic progression 2,5,8,11,.... till n number
        Scanner sc = new Scanner(System.in);
        System.out.print("Give starting number : ");
        int startNumber = sc.nextInt();

        System.out.print("Give difference between number : ");
        int difference = sc.nextInt();

        System.out.print("Give N number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(startNumber + " ");
            startNumber += difference;
        }

    }
}
