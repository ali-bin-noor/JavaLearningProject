package practiceJavaPrograms.basicPrograms;

import java.util.Scanner;

//WAP to return composite numbers from 2 to n
//composite number means jo 1 or n se chod ke dusre kisi number se divide hota hai
// 10 is divisible by 2 and 5 1 and 10 ko chod ke
public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean flag = false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if (n==1) System.out.println("Neither Prime nor composite");
        else if(flag==true) System.out.println("Number is composite.");
        else System.out.println("Number is Prime.");
    }
}
