package practiceJavaPrograms.basicPrograms;

import java.util.Scanner;

public class RealNumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double n = sc.nextDouble();
        if (n == (int)n){
            System.out.println("Integer");
        }else {
            System.out.println("not integer");
        }
    }
}
