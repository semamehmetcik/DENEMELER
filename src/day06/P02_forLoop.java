package day06;

import java.util.Scanner;

public class P02_forLoop {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle yazar mısınız?");
        String cumle = scanner.nextLine().toLowerCase();

        System.out.println("Bir harf yazar mısınız?");
        char harf = scanner.next().toLowerCase().charAt(0);

        int sayac = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == harf) {
                sayac++;
            }

        }
        if (sayac!=0){
            System.out.println("Cümlede "+harf+" harfi "+sayac+" adet var");
        }else {
            System.out.println("girdiğiniz "+harf+" cümlede yok");
        }
    }
}
