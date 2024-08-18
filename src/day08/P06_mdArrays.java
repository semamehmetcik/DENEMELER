package day08;

import java.util.Arrays;

public class P06_mdArrays {
    public static void main(String[] args) {

        // multidimensional arrayin iç array lerindeki tüm elemanların
        // toplamını birer birer bulan
        // ve herbir sonucu yeni bir arrayin elemanı yapan ve
        // yeni array i ekrana yazdıran programı yaziniz.
        // input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

        int mdArrays[][]={{10,20,30},{4},{6,7,20,2,7,3,9}};

        int cikti[]=new  int[mdArrays.length];

        for (int i = 0; i <mdArrays.length ; i++) {
            for (int j = 0; j < mdArrays[i].length; j++) {
                cikti[i] += mdArrays[i][j];

            }

        }
        System.out.println(Arrays.toString(cikti));
    }

}
