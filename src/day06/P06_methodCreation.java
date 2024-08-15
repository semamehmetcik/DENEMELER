package day06;

import java.util.Scanner;

public class P06_methodCreation {

     /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static String tekKarakter(String girdi){
        String sonuc = "";

        for (int i = 0; i <girdi.length() ; i++) {
            char harf = girdi.charAt(i);
            if (sonuc.indexOf(harf)==-1){
                sonuc+=harf;
            }

        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Lütfen metin giriniz");
        String girdi = scanner.nextLine();

        System.out.println("Tek olan harfler : "+ tekKarakter(girdi));
        scanner.close();
    }
}
