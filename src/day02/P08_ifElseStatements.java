package day02;

import java.util.Scanner;

public class P08_ifElseStatements {
    public static void main(String[] args) {
        /* Problem tanimi : Kulanicidan aracacinin hizini aliniz Trafik cezasinin
         * degerini hesaplayin. 45 hiz siniridir.
         * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
         * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
         * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
         * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
         * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         * -----------------------------------------

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ehliyetiniz var mı: E / H");
        char ehliyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Hız değeri");
        int hız = scanner.nextInt();


        if (ehliyet == 'E') {
            if (hız< 55){
                System.out.println("Hız limitine uydunuz");
            }else if (hız>=55 && hız<=74){
                System.out.println("Cezanız : 100$");
            }else if (hız>=75 && hız<=84){
                System.out.println("Cezanız : 150$");
            }else if (hız>=85 && hız<=94){
                System.out.println("Cezanız : 320$");
            }else if (hız>=95){
                System.out.println("Cezanız : 500$");
            }


        }
/*
---------------------------------------------------------------
 */


        else if (ehliyet == 'H') {
            if (hız < 55) {
                System.out.println("Hız limitine uydunuz");
            } else if (hız >= 55 && hız <= 74) {
                System.out.println("Cezanız : 300$");
            } else if (hız >= 75 && hız <= 84) {
                System.out.println("Cezanız : 320$");
            } else if (hız >= 85 && hız <= 94) {
                System.out.println("Cezanız : 520$");
            } else if (hız >= 95) {
                System.out.println("Cezanız : 750$");
            }
        }
        else {
                System.out.println("Ehliyet bilgisi yanlış");
            }

    }
}
