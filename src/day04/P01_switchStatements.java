package day04;

import java.util.Scanner;

public class P01_switchStatements {
    public static void main(String[] args) {

            /*
    Kullanıcıdan alınan bir sayının kaç basamaklı olduğunu yazdıran bir Java programı yazınız
    Girilen sayı negatifse, pozitif olarak ele alınacaktır. switch yapısını kullanarak çözünüz.
     */


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");

        if (scanner.hasNextInt()){

            int sayi = scanner.nextInt();

            if (sayi<0){
                sayi = -sayi;

            }
            String pozitifSayi = (""+ sayi);
            int basamakSayisi = pozitifSayi.length();

            switch (basamakSayisi){
                case 1: System.out.println("1 basamaklıdır"); break;
                case 2: System.out.println("2 basamaklıdır"); break;
                case 3: System.out.println("3 basamaklıdır"); break;
                case 4: System.out.println("4 basamaklıdır"); break;
                case 5: System.out.println("5 basamaklıdır"); break;
                case 6: System.out.println("6 basamaklıdır"); break;
                case 7: System.out.println("7 basamaklıdır"); break;
                case 8: System.out.println("8 basamaklıdır"); break;
                case 9: System.out.println("9 basamaklıdır"); break;
                case 10: System.out.println("10 basamaklıdır"); break;
            }


        }else {
            System.out.println("Sayı girmeniz gerekiyor, tekrar deneyin");
        }



    }
}
