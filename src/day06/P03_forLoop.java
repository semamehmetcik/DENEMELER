package day06;

import java.util.Scanner;

public class P03_forLoop {
    public static void main(String[] args) {
        /*

         *
        ***
       *****
        ***
         *

        şeklini yazdırınız.


        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yükseklik girin : ");
        int yukseklik = scanner.nextInt();
        int n = yukseklik/2+1; // ORTA NOKTAYI BULMAK İÇİN

        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <=(2*i-1) ; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
        //ALT KISIM
        for (int i = n-1; i >=1 ; i--) {
            for (int j = n; j >i ; j--) {
                System.out.print(" ");

            }
            for (int k = 1; k <=(2*i-1) ; k++) {
                System.out.print("*");

            }
            System.out.println();
        }





    }
}
