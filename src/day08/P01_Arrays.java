package day08;

import java.util.Arrays;
import java.util.Scanner;

public class P01_Arrays {
    public static void main(String[] args) {

        // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
        // kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
        // elemaninin arasinki farki gosteren java programi yazin


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen kaç adet sayı gireceğinizi yazın :");
        int sayi = scanner.nextInt();

        int arr[] = new int[sayi];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i+1+ ".ci sayıyı giriniz");
            int arrEleman = scanner.nextInt();
            arr[i] =arrEleman;

        }
        System.out.println("İLK HAL : "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("SIRALANDI : "+Arrays.toString(arr));
        System.out.println(" En buyuk ile en kucuk elemaninin arasinki fark : "+(arr[arr.length-1]- arr[0]));
    }
}
