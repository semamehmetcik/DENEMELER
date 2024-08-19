package PROJE;

import java.util.Scanner;

public class Anamenu {

               /*
    ====================================
	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
	====================================
	    1- ÖĞRENCİ İŞLEMLERİ
	    2- ÖĞRETMEN İŞLEMLERİ
	    Q- ÇIKIŞ
        */

    void menu(){//------------------METHOD UN İSMİ == "menu" ----------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t====================================\n"+
                           "\t\t1- ÖĞRENCİ İŞLEMLERİ\n"+
                           "\t\t2- ÖĞRETMEN İŞLEMLERİ\n"+
                           "\t\tQ- ÇIKIŞ\n"+
                           "\t====================================\n\nSEÇİMİNİZ: ");

        char secim =scanner.next().charAt(0);

        switch (secim){
            case '1':
                break;
            case '2':
                break;
            case 'Q':
                break;
            case 'q':
                break;
            default:
                System.out.println("HATALI GİRİŞ YAPTINIZ");
                menu();
        }

    }


}
