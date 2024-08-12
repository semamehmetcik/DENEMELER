package day03;

import java.util.Scanner;

public class P02_switchStatements {
    public static void main(String[] args) {

        //Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir tamsayı giriniz");

        if (scanner.hasNextInt()){
        int sayi = scanner.nextInt();

        if (sayi>=100 && sayi<=999) {
            int yuzler = sayi / 100;
            int onlar = (sayi % 100) / 10;
            int birler = sayi % 10;

            String sonuc = "";


            switch (yuzler) {
                case 1:
                    sonuc += "yüz";
                    break;
                case 2:
                    sonuc += "ikiyüz";
                    break;
                case 3:
                    sonuc += "üçyüz";
                    break;
                case 4:
                    sonuc += "dörtyüz";
                    break;
                case 5:
                    sonuc += "beşyüz";
                    break;
                case 6:
                    sonuc += "altıyüz";
                    break;
                case 7:
                    sonuc += "yediyüz";
                    break;
                case 8:
                    sonuc += "sekizyüz";
                    break;
                case 9:
                    sonuc += "dokuzyüz";
                    break;

            }
            switch (onlar) {
                case 1:
                    sonuc += "on";
                    break;
                case 2:
                    sonuc += "yirmi";
                    break;
                case 3:
                    sonuc += "otuz";
                    break;
                case 4:
                    sonuc += "kırk";
                    break;
                case 5:
                    sonuc += "elli";
                    break;
                case 6:
                    sonuc += "atmış";
                    break;
                case 7:
                    sonuc += "yetmiş";
                    break;
                case 8:
                    sonuc += "seksen";
                    break;
                case 9:
                    sonuc += "doksan";
                    break;

            }
            switch (birler) {
                case 1:
                    sonuc += "bir";
                    break;
                case 2:
                    sonuc += "iki";
                    break;
                case 3:
                    sonuc += "üç";
                    break;
                case 4:
                    sonuc += "dört";
                    break;
                case 5:
                    sonuc += "beş";
                    break;
                case 6:
                    sonuc += "altı";
                    break;
                case 7:
                    sonuc += "yedi";
                    break;
                case 8:
                    sonuc += "sekiz";
                    break;
                case 9:
                    sonuc += "dokuz";
                    break;

            }


            System.out.println(sonuc);


        }else {
            System.out.println("Sayı 3 basamaklı girilmedi");
        }
        }else {
            System.out.println("Sadece TAMSAYI Girebilirsiniz");
        }
    }
}
