package day09;

public class P01_altAltaYazdirma {
    public static void main(String[] args) {

        /*
    12345 sayisinin herbir basamagini konsolda altalta yazdirin.
    input: 12345
    output: 1
            2
            3
            4
            5
     */

        int sayi = 123456;
        int birlerBas=sayi%10;
        int onlarBas=(sayi/10)%10;
        int yüzlerBas=(sayi/100)%10;
        int binlerBas=(sayi/1000)%10;
        int onbinlerBas=(sayi/10000)%10;
        int yuzbinlerBas=(sayi/100000)%10;

        System.out.println("SAYIMIZ : " +sayi);
        System.out.println(birlerBas+ "\n"+onlarBas+ "\n"+yüzlerBas+ "\n"+binlerBas+ "\n"+onbinlerBas+ "\n"+yuzbinlerBas);
        System.out.println("------------------------");
        System.out.println(yuzbinlerBas+ "\n"+onbinlerBas+"\n"+binlerBas+"\n"+yüzlerBas+"\n"+onlarBas+"\n"+birlerBas);


    }
}
