package day06;

public class P05_methodCreation {

    public  static  String tekrarliMetin(String metin, int tekrar){
        String result= metin.repeat(tekrar);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(tekrarliMetin("Yazılımcı oldum ", 10));
    }
}
