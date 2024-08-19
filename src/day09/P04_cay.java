package day09;

import java.util.Scanner;

public class P04_cay {
    public static void main(String[] args) {

        /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
    */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Günlük çay tüketiminizi yazar mısınız");
        double gunlukCay= scanner.nextDouble();

        System.out.println("Bir bardağa attığınız şeker adedini yazar mısınız");
        double seker = scanner.nextDouble();

        if (seker==0){
            System.out.println("Aferin, boyle devam et :)");
        }
        if (seker>0){
            double yillikTuketim = (gunlukCay*seker*2.77*365)/1000;
            double kirkYillikTuketim = yillikTuketim*40;
            System.out.println("YILLIK ŞEKER TÜKETİMİNİZ : "+yillikTuketim);
            System.out.println("KIRK YILLIK ŞEKER TÜKETİMİNİZ : "+kirkYillikTuketim);
        }


    }
}
