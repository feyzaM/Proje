package team05;

import java.util.Scanner;

public class Soru12 {
    public static void main(String[] args) {
        ////Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
        //// istedigi birim metre veya santimetre ise cevirip yazdirin,
        //// yoksa "istediginiz birim sisteme kayitli degil" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen mesafeyi km olarak giriniz");
        int km= scan.nextInt();
        System.out.println("lutfen cevirmek istediginiz birimi yaziniz");
        String birim=scan.next();
        int sonuc=1;

        if (birim.substring(0,1).equalsIgnoreCase("m")){
            sonuc=km*1000;
        } else if (birim.substring(0,1).equalsIgnoreCase("s")) {
            sonuc=km*10000;
        }else {
            System.out.println("kayitli degil");
        }

    }
}
