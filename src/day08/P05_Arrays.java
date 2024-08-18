package day08;

import java.util.Arrays;

public class P05_Arrays {
    public static void main(String[] args) {

    /*TASK :
	write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)

	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

	*/
        //1. YOL---------------
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println( "EN KÜÇÜK SAYI : "+arr[0]);
        System.out.println( "EN BÜYÜK İKİNCİ SAYI : "+arr[arr.length-2]);
        System.out.println( "EN BÜYÜK SAYI : "+arr[arr.length-1]);


        //2. YOL---------------(SORT OLMADAN)

        int minimum = 0;
        int maximum = 0;
        int maximum2 = 0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>maximum){
                maximum= arr[i];
            } else if (arr[i]>maximum2 && arr[i]<maximum) {
                maximum2=arr[i];

            }
            if (arr[i]<minimum){
                minimum=arr[i];
            }

        }
        System.out.println("");
        System.out.println( "EN KÜÇÜK SAYI : "+minimum);
        System.out.println( "EN BÜYÜK İKİNCİ SAYI : "+maximum2);
        System.out.println( "EN BÜYÜK SAYI : "+maximum);



    }
}
