package day01;

import java.util.Scanner;

public class P02_Casting {
    public static void main(String[] args) {

            /*
    Kullanıcıdan iki adet ondalıklı sayı alıp bu ondalıklı sayıları birbirne bölüp sonucu tamsayı olarak yazdırın
     */


        // ------------------ byte<short<int<long<float<double ------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ondalıklı bir sayı giriniz");
        double sayi1 = scanner.nextDouble();
        System.out.println("Lütfen ondalıklı bir sayı giriniz");
        double sayi2 = scanner.nextDouble();
        int sonuc = (int)(sayi1/sayi2);
        System.out.println("Sonuc : "+ sonuc);
        System.out.println("Double Sonuc : "+sayi1/sayi2);
    }
}
