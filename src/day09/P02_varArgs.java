package day09;

public class P02_varArgs {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve

        concat("m", "e", "r", "v", "e");
    }
    public  static void concat(String... str){

        String yeni = "";
        for (String each: str){
            yeni = yeni.concat(each);
        }
        System.out.println(yeni);
    }
}
