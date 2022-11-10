package nurfeyza;

import java.util.Scanner;

public class AyseHocaSoru {
    public static void main(String[] args) {
        /*
   Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
   dort islemden biri ile isleme koyup sonucunu yazdiriniz
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("lutfen matematiksel bir islem girin");
        String islem=scan.next();

        switch (islem){
            case "+":
                System.out.println(sayi1+sayi2);
                break;
            case "-":
                System.out.println(sayi1-sayi2);
                break;
            case "*":
                System.out.println(sayi1*sayi2);
                break;
            case "/":
                System.out.println(sayi1/sayi2);
                break;
            default:
                System.out.println("lutfen sadece dort islem giriniz");

        }


    }
}
