package day06;

import java.util.Scanner;

public class P08_whileLoop {
    public static void main(String[] args) {
        // Bir top 220 m  yükseklikten atılmaktadır.
        // Yer çarptıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bırakılan yüksekliği yazınız");
        double yukseklik = scanner.nextDouble();

        double toplamYol= 0;
        int sayac =0;

        while (yukseklik>=1){
            toplamYol+=yukseklik;
            yukseklik*=0.75; //0.75 == 3/4
            sayac++;
        }
        System.out.println("topun yere çarpma miktarı : "+sayac);
        System.out.println("Alınan yol : "+toplamYol);
    }
}
