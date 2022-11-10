package slackten_atilan_sorular;

import java.util.Scanner;

public class S05_ASehrindenBSehrine {
   /* A şehrinden uçmak isteyen bir kişi B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    km birim fiyati : 0.10$, 12 yasindan kucukse toplam fiyat %50 indirim , 12 ve 24
    yas arasindaysa 10% 65 yasindan buyukse 30%, gidis donus alirsa20% bu
    kosullara gore yolcudan gideceği mesafeyi isteyip ucak biletini hesaplayan program
 */


    public static void main(String[] args) {
       method1();
    }
    public static void method1(){

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gideceginiz sehri secin ==>B sehri C sehri D sehri");
        String sehir=scan.next();
        System.out.println("lutfen yasinizi girin");
        int yas= scan.nextInt();
        boolean tekYonMu=true;
        double kmFiyat=0.10;
        double biletFiyati=0.0;

        if (sehir.equalsIgnoreCase("B")){
            if (yas<=12 && tekYonMu){
                biletFiyati=500*0.10*50/100;
            }else if(yas<=12 && !tekYonMu){
                biletFiyati=500*0.10*50/100*0.8*2;
            } else if (yas>12 && yas<=24 && tekYonMu) {
                biletFiyati=500*0.10*0.9;
            } else if (yas>12 && yas<=24 && !tekYonMu) {
                biletFiyati=500*0.10*0.9*0.8*2;
            } else if (yas>=65 && tekYonMu) {
                biletFiyati=500*0.10*0.7;
            }else if(yas>=65 && !tekYonMu){
                biletFiyati=500*0.10*0.7*0.8*2;
            }else {
                biletFiyati=500*0.10;
            }
        }
        if (sehir.equalsIgnoreCase("C")){
            if (yas<=12 && tekYonMu){
                biletFiyati=700*0.10*50/100;
            }else if(yas<=12 && !tekYonMu){
                biletFiyati=700*0.10*50/100*0.8*2;
            } else if (yas>12 && yas<=24 && tekYonMu) {
                biletFiyati=700*0.10*0.9;
            } else if (yas>12 && yas<=24 && !tekYonMu) {
                biletFiyati=700*0.10*0.9*0.8*2;
            } else if (yas>=65 && tekYonMu) {
                biletFiyati=700*0.10*0.7;
            }else if(yas>=65 && !tekYonMu){
                biletFiyati=700*0.10*0.7*0.8*2;
            }else {
                biletFiyati=700*0.10;
            }
        }
        if (sehir.equalsIgnoreCase("D")){
            if (yas<=12 && tekYonMu){
                biletFiyati=900*0.10*50/100;
            }else if(yas<=12 && !tekYonMu){
                biletFiyati=900*0.10*50/100*0.8*2;
            } else if (yas>12 && yas<=24 && tekYonMu) {
                biletFiyati=900*0.10*0.9;
            } else if (yas>12 && yas<=24 && !tekYonMu) {
                biletFiyati=900*0.10*0.9*0.8*2;
            } else if (yas>=65 && tekYonMu) {
                biletFiyati=900*0.10*0.7;
            }else if(yas>=65 && !tekYonMu){
                biletFiyati=900*0.10*0.7*0.8*2;
            }else {
                biletFiyati=900*0.10;
            }
        }
        System.out.println(biletFiyati);


    }




}
