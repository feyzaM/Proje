package team05;

public class Soru11 {

    static int sayi=10;
    static int bayrak=0;
    public static void main(String[] args) {
        //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
        // Girilen sayinin asal sayi olup olmadigini kontrol edip,
        // sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.


    }

    public static String asalMi(int sayi){
        String sonuc="asal degil";
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                bayrak++;
                break;
            }
        }if (bayrak==0){
            sonuc="asal";
        }
        return sonuc;
    }

}
