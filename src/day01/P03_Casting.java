package day01;

import java.util.Scanner;

public class P03_Casting {
    public static void main(String[] args) {

        /*
        2- Kullanıcdan bir harf girmesini isteyiniz.
        O harften sonra gelen harfleri
            Girdiğiniz harf :
            Girdiğiniz harften sonraki  3 harf :
        şeklinde yazdırın.
        ipucu: char
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf girin");
        char harf = scanner.next().charAt(0);
        System.out.println("Girilen Harf : " + harf);
        System.out.println("Girdiğiniz Harften sonraki 3 harf :\n " + (char) (harf+1)+ " - " +(char)(harf+2)+" - " + (char)(harf+3));

    }
}
