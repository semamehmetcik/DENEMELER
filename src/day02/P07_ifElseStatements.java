package day02;

import java.util.Scanner;

public class P07_ifElseStatements {
    public static void main(String[] args) {

                /*
    Kullanıcıdan üçgenin kenar uzunluklarını isteyip
        -Eğer üç kenar da eşitse eşitkenar üçgen
        -İki kenar eşitse ikizkenar üçgen yazdırın
     */
        Scanner murat=new Scanner(System.in);
        System.out.println("Lütfen kontrol edilecek üçgenin kenar uzunluklarını giriniz!");
        System.out.print("1.Kenar: ");
        double kenar1=murat.nextDouble();
        System.out.print("2.Kenar: ");
        double kenar2=murat.nextDouble();
        System.out.print("3.Kenar: ");
        double kenar3=murat.nextDouble();

        if (kenar1 == kenar2 && kenar1== kenar3){
            System.out.println("\"Eşkenar Üçgen'dir\"");

        }else if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3){
            System.out.println("\"İkizkenar Üçgen'dir\"");
        }else {
            System.out.println("\"Çeşitkenar Üçgen'dir\"");
        }
    }



}
