package team05;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Soru3 {
    public static void main(String[] args) {

        //Klavyeden öğrencinin aldığı notu okuyan ve okunan bu nota göre öğrencinin durumunu değerlendiren
        // (Çok Güzel, Ortalamanın üzerinde, Ortalamanın altında gibi)
        // bilgisayar programını Java programlama dilinde yazınız. 80 üstü ,45-80, 45 altı sirasıyla yazdm

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double not= scan.nextDouble();

        if (not>=80 && not<=100){
            System.out.println("cok guzel");
        } else if (not<80 && not>=45) {
            System.out.println("ortalamanin uzerinde");
        } else if (not<45) {
            System.out.println("ortalamanin altinda");
        }else{
            System.out.println("gecersiz not");
        }


    }
}
