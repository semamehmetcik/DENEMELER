package day01;

import java.util.Scanner;

public class P05_ifElseStatements {
    public static void main(String[] args) {

        /*
         Kullanıcıdan üçgenin kenar uzunluklarını isteyip
        -Eğer üç kenar da eşitse eşitkenar üçgen
        -İki kenar eşitse ikizkenar üçgen yazdırın
        */

        Scanner sema = new Scanner(System.in);
        System.out.println("Üçgenin kenar uzunluklarını girer misiniz");
        System.out.println("1.Kenar : ");
        double kenar1 = sema.nextDouble();
        System.out.println("2.Kenar : ");
        double kenar2 = sema.nextDouble();
        System.out.println("3.Kenar : ");
        double kenar3 = sema.nextDouble();

        if ( kenar1== kenar2 && kenar1==kenar3){
            System.out.println("EŞKENAR ÜÇGENDİR");
        }
        if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3){
            System.out.println("İKİZKENAR ÜÇGENDİR");
        }
        /*

         */
    }
}
