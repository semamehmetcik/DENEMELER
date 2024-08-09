package day02;

import java.util.Scanner;

public class P10_Ternary {
    public static void main(String[] args) {

    /*
    18 yaşından küçüklere sigara satmak yasaktır.
    Sigara alana yaşını sorup sigara alıp alamayacağını
    bir teranry kod ile yazdırınız
   */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı söyler misiniz");
        int age =scanner.nextInt();
        System.out.println(age>=18 ? "sigara alabilirsiniz" :"sigara alamazsınız"  );
    }
}
