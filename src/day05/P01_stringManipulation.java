package day05;

import java.util.Scanner;

public class P01_stringManipulation {
    public static void main(String[] args) {

        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.


        Scanner scanner = new Scanner(System.in);
        System.out.println("metin girer misiniz");
        String metin = scanner.nextLine();

        if (metin.contains(" ")){
            System.out.println("boşluk var");
        }else {
            System.out.println("boşluk yok");
        }


        /*
          Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
          ad ayrı soyad ayrı sekilde ekrana yazdırınız.
        */


        System.out.println("isim soyisim girer misiniz,iki isminiz varsa tekini girin");
        String nameSurname = scanner.nextLine();
        String name = nameSurname.substring(0, nameSurname.indexOf(" "));
        String surname = nameSurname.substring(nameSurname.indexOf(" ") +1);

        System.out.println("isim :"+ name+"\nSoyisim :"+surname);

    }
}
