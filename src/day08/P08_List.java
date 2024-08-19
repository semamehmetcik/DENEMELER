package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P08_List {
    public static void main(String[] args) {

        //  /*
        //     * Input olarak verilen listteki isimlerden
        //     * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
        //     *
        //     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
        //     * OUTPUT : [Veli,Omer]
        //     */

        //List<String> list=new ArrayList<>();
        //list.add("SEMA MEHMETÇİK");
        //list.add("SEMA MEHMETÇİK");
        //list.add("SEMA MEHMETÇİK");
        //list.add("SEMA MEHMETÇİK");
        //list.add("SEMA MEHMETÇİK");
        //list.add("SEMA MEHMETÇİK");
        //list.add("SEMA MEHMETÇİK");
        //list.add("SEMA MEHMETÇİK");
        //System.out.println(list);

        ArrayList<String> list=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        System.out.println("Listin ilk hali: "+list);

        List<String> newList=new ArrayList<>();

        for (String each:list) {
            if (!each.toLowerCase().contains("a")){
                newList.add(each);
            }

        }


        System.out.println("Yeni Oluşan Liste: "+newList);


    }
}
