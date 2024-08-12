package day05;

import java.util.Scanner;

public class P04_forLoop {
    public static void main(String[] args) {

        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
         * döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String metin = scanner.nextLine().toUpperCase();

        int flag = 0;

        for (int i = 0;   i < metin.length() ; i++) {
            if (metin.charAt(i)=='A'){
                flag++;
            }
            if (metin.charAt(i)=='C'){
                break;
            }
        }
        System.out.println(flag);

    }
}
