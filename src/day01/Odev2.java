package day01;

import javax.swing.*;

public class Odev2 {
    public static void main(String[] args) {

        /*1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
        ******       KAYIT BAŞARILI      ******
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com.tr
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.

         */


        String ad = JOptionPane.showInputDialog("Adınız :");
        String soyad = JOptionPane.showInputDialog("Soyadınız :");
        String yas = JOptionPane.showInputDialog("Yaşınız :");
        String mail = JOptionPane.showInputDialog("Mail AAdresiniz :");
        String sifre = JOptionPane.showInputDialog("şifreniz :");

        System.out.println("******       KAYIT BAŞARILI      ******\nAdınız : "+ ad+
                                                                    "\nSoyadınız : " + soyad +
                                                                    "\nYaşınız   : " + yas +
                                                                    "\nMail AAdresiniz : " + mail +
                                                                    "\nşifreniz : " + sifre +
                                                                     "\n şeklinde kaydınız tamamlanmıştır");








    }
}
