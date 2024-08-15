package day06;

import java.util.Scanner;

public class P07_whileLoop {
    public static void main(String[] args) {
        /// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create
        // ediniz.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bölünecek sayı : ");
        int bolunen = scanner.nextInt();

        System.out.println("Bölen sayı : ");
        int bolen = scanner.nextInt();

        bolmeIslemi(bolunen,bolen);
    }

    private static void bolmeIslemi(int bolunen, int bolen) {
        int ilkBolunen = bolunen;
        int sayac = 0;

        while (bolunen>=bolen){
            bolunen = bolunen-bolen;
            sayac++;
        }
        System.out.println(ilkBolunen+" / "+bolen+" = "+sayac);
    }


}
