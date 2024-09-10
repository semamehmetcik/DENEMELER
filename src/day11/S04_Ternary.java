package day11;

import java.util.Scanner;

public class S04_Ternary {
    public static void main(String[] args) {

        //Kullanicidan bir sayi al
        //0 dan büyükse ve esitse 10 dan kucuk olup olmadigini kontrol et
        //10 dan kücükse ekrana "rakam" yazdir, degilse "pozitif sayi" yazdir
        //sayi 0 dan kücük ise "nagatif sayi" yazdir

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scanner.nextInt();

        System.out.println(sayi<0 ? "negatif sayi " : sayi<=9 ? "rakam " : "pozitif sayıdır");


    }
}
