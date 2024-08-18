package day08;

import java.util.Arrays;

public class P04_Arrays {
    public static void main(String[] args) {
        /*
         * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
         *
         * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
         */


        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String arr[]= str.split(" ");

        int dolarToplami = 0;
        int poundToplami = 0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].contains("$")){
                dolarToplami += Integer.parseInt(arr[i].replace("$", ""));
            }else {
                poundToplami+= Integer.parseInt(arr[i].replace("£" ,""));
            }

        }
        System.out.println("DOLAR TOPLAMI : "+dolarToplami +"$");
        System.out.println("POUND TOPLAMI : "+poundToplami+ "£");
    }
}
