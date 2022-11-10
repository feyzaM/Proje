package nurfeyza;

import java.util.Scanner;

public class Nuropo10 {
    public static void main(String[] args) {
        /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
        Input :
        John White
        1234234534561478
        Output : Name :
        J** W*
        CCN  : ** ** ** 1478
        * Ilk Harfler Buyuk harf ile baslamalidir.


         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= scan.next();
        System.out.println("lutfen soy isminizi giriniz");
        String soyIsim=scan.next();
        System.out.println("lutfen 16 haneli kart numaranizi giriniz");
        String kartNo=scan.next();

        isim=isim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");
        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+" "+soyIsim);

        kartNo=kartNo.substring(0,4).replaceAll("\\d","*")+" "+kartNo.substring(4,8).replaceAll("\\d","*")+" "+
                kartNo.substring(8,12).replaceAll("\\d","*")+" "+
                kartNo.substring(12);
        System.out.println(kartNo);

    }
}
