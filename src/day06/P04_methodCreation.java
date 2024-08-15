package day06;

import java.util.Scanner;

public class P04_methodCreation {

    //Soru: Bir metod oluşturun ve bu metod bir string ve bir sayı alıp,
    // string'i belirtilen sayı kadar tekrar etsin ve sonucu döndürsün.

    public  static String metinTekrari(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen metin girin");
        String metin = scanner.nextLine();

        System.out.println("Lütfen tekrar miktarını girin");
        int tekrarSayisi = scanner.nextInt();

        String sonuc = "";

        for(int i = 0;i <=tekrarSayisi;i++) {
            sonuc += metin;

        }
        return sonuc;
    }

    public static void main(String[] args) {
        System.out.println(metinTekrari());
    }


}

