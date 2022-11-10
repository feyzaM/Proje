package karisikSorular;

import java.util.Scanner;

public class F05_IsimSoyisim {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve
        // hangisinin daha uzun oldugunu yazdiran bir method olusturun

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen isminizi giriniz");
        String isim= scan.next();

        System.out.println("lutfen soyisminizi giriniz");
        String soyIsim=scan.next();




    }
    public static void isimSoyisimMethodu(String isim,String soyIsim){


        if (isim.length()>soyIsim.length()){
            System.out.println(isim);
        }else {
            System.out.println(soyIsim);
        }

    }
}
