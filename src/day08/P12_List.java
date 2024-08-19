package day05;

import java.util.ArrayList;
import java.util.List;

public class P12_List {
    public static void main(String[] args) {

        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int arr[] = {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        List<Integer> tekrarsizListe = new ArrayList<>();

        for (Integer each: arr){
            if (!tekrarsizListe.contains(each)){
                tekrarsizListe.add(each);
            }
        }
        System.out.println("TEKRARSIZ LİSTE : "+tekrarsizListe);
    }
}
