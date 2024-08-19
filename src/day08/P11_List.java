package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P11_List {
    public static void main(String[] args) {

          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */

        List<Integer> nots = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yeni not için N'ye basınız");
        char devam =scanner.next().charAt(0);

        while (devam=='N' || devam=='n'){
            System.out.println("NOTU GİRİN : ");
            nots.add(scanner.nextInt());

            System.out.println("yeni not için N , ortalama için X tuşuna basınız");
            devam = scanner.next().charAt(0);
        }

        double ortalama = 0;
        int toplam = 0;

        for (int i = 0; i <nots.size() ; i++) {
            toplam+=nots.get(i);

        }
        ortalama=toplam/nots.size();


        List<Integer> ortUstu=new ArrayList<>();
        for (int i = 0; i < nots.size(); i++) {
            if (ortalama<nots.get(i));
            ortUstu.add(nots.get(i));

        }

        System.out.println("Girilen notlar: "+nots);
        System.out.println("Not ortalaması: "+ortalama);
        System.out.println("Ortalamayı gecen kişi sayısı: "+ortUstu.size());
    }
}
