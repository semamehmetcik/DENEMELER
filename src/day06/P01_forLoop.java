package day06;

import java.util.Scanner;

public class P01_forLoop {
    public static void main(String[] args) {

        /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("1'den büyük bir tamsayı yazar mısınız");
        int sayi = scanner.nextInt();
        int toplam = 0;

         if (sayi<=1){
             System.out.println("Yazdığınız sayı 1'den küçük, sayıyı değiştirin");
         }else {

             for (int i = 0; i <= sayi ; i++) {
                 toplam +=i * i;
             }
             System.out.println(sayi+ " sayısını girerek "+toplam+" sonucunu elde ettiniz");
         }
    }
}
