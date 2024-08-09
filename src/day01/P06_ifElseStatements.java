package day01;

import java.util.Scanner;

public class P06_ifElseStatements {
    public static void main(String[] args) {
        /*
		 *  Kullanicidan IT alanini isteyerek
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		yazdiriniz
		 */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesleğinizi qa, dev, ba, pm şeklinde giriniz");
        String meslek = scanner.nextLine();

        if (meslek.equalsIgnoreCase("qa")) {
            System.out.println("Mesleğiniz : Quality Analist");
        }else if (meslek.equalsIgnoreCase("dev")){
            System.out.println("Mesleğiniz : Developer :)");
        }else if (meslek.equalsIgnoreCase("ba")){
            System.out.println("Mesleğiniz : Bussines Analist");
        }else if (meslek.equalsIgnoreCase("pm")){
            System.out.println("Mesleğiniz : Project Manager");
        }else {
            System.out.println("Hatalı giriş yaptınız");
        }





    }
}
