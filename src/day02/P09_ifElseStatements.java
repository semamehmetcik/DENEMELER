package day02;

import java.util.Scanner;

public class P09_ifElseStatements {
    public static void main(String[] args) {


    /*
    ********************************************************************************
    Soru ) Interview Question
    Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.

    Kural 1: 4 ile bolunen yillar artik yildir
    Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir(istisna)
    Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir(İstisnanın İstisnası)

     */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir yıl girer misiniz");
        int yıl = scanner.nextInt();
        System.out.println("***********İF ÇÖZÜMÜ****************");



        if (yıl %100==0 && yıl%400==0){
            System.out.println("Artık yıldır");
        }else if (yıl%100!=0 && yıl%4==0 ){
            System.out.println("Artık yıldır");
        }else {
            System.out.println("Artık yıl değildir");
        }

        /*********************************************************************************/
                /*
        ? = ise anlamına gelir
        : = değilse anlamına gelir
         */



        System.out.println("***********TERNARY ÇÖZÜMÜ***********");

        System.out.println(yıl%100==0 ? yıl%400==0 ? "Artık yıldır" : "Artık yıl değildir" : yıl%4==0 ? "Artık yıldır": "Artık yıl değildir" );

    }
}
