package day07;

import java.util.Scanner;

public class P01_doWhileLoop {
    public static void main(String[] args) {

        // kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.


        Scanner scanner = new Scanner(System.in);
        int pin=0;
        int securityPin= 8796;

        do {
            System.out.println("kodu giriniz");
            pin =scanner.nextInt();

            if (pin==securityPin){
                System.out.println("DOĞRU GİRİŞ YAPILDI");
            }else {
                System.out.println("YANLIŞ GİRİŞ YAPILDI");
            }
        }while (pin!=securityPin);
        }

    }




