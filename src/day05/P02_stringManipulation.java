package day05;

import java.util.Scanner;

public class P02_stringManipulation {
    public static void main(String[] args) {


        //Kullanıcıdan alacağınız, 3 kelimeden oluşan metni
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.


        Scanner scanner = new Scanner(System.in);
        System.out.println("3 kelimeli bir metin yazar mısınız");
        String metin = scanner.nextLine();

        String ilkHarf = metin.substring(0, metin.indexOf(" "));
        String ikinciHarf = metin.substring(metin.indexOf(" ")+1, metin.lastIndexOf(" "));
        String ucuncuHarf = metin.substring(metin.lastIndexOf(" ")+1);

        System.out.println("ilk harfler : " +ilkHarf.substring(0,1).toUpperCase()+ikinciHarf.substring(0,1)+ucuncuHarf.substring(0,1));

    }
}
