package practiceJavaPrograms.patternPrinting;

import java.util.Scanner;

/*
  1 2 3 4
  1 2 3 4
  1 2 3 4
  1 2 3 4
*/
public class NumberPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int row = sc.nextInt();

      /*  for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        *//*
        A B C
        A B C
        A B C
        *//*
        for (int i = 1; i <= row; i++) {
            char ch = 'A';
            for (int j = 1; j <= row; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
*/

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        /*for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/



        /*
        1
        A B
        1 2 3
        A B C D
        1 2 3 4 5
        */
       /* for (int i = 1; i <= row; i++) {
            char c = 'A';
            for (int j = 1; j <= i; j++) {
                if(i%2!=0){
                    System.out.print(j+" ");
                }else{
                    System.out.print(c+" ");
                    c++;
                }
            }
            System.out.println();
        }*/

        /*
         * * * *
         * * *
         * *
         *
         */
        /*for (int i = 1; i <= row; i++) {
            for (int j = row; j >=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
    }
}