package team05;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        //Soru1: String tipinde sabit bir şifre değişkeni oluşturun.
        // Örneğin: String password = “12345”; gibi.
        // Ardından, kullanıcıdan klavyeden bir şifre girmesini isteyin.
        // Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın.
        // Eğer, iki değer birbirine eşitse ekrana “Giriş Başarılı!”, değilse “Giriş Başarısız” yazdırın.

        String password="320232";

        System.out.println("lutfen sifrenizi giriniz");
        Scanner scan=new Scanner(System.in);

        String girilenSifre=scan.nextLine();

        if (password.equals(girilenSifre)){
            System.out.println("Giriş Başarılı!");
        }else{
            System.out.println("Giriş Başarısız");
        }

    }
}
