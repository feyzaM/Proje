package nurfeyza;

import java.util.Scanner;

public class AyseHocaSoru2 {
    public static void main(String[] args) {
        /*Kullanicidan satin aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri karti
olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim
yapin, Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin"*/


        Scanner scan=new Scanner(System.in);
        System.out.println("urun adedini girin");
        int urunAdedi= scan.nextInt();
        System.out.println("aldıgınız urun fiyatini girin");
        double listeFiyati= scan.nextDouble();
        System.out.println("musteri kartiniz varsa 1 e yoksa 0 a basin");
        int musteriKarti=scan.nextInt();

        if (musteriKarti==1){
            if (urunAdedi>=10){
                System.out.println(listeFiyati-(listeFiyati*0.2));

            }else{
                System.out.println(listeFiyati-(listeFiyati*0.15));
            }

        }
        if (musteriKarti==0){
            if (urunAdedi>=10){
                System.out.println(listeFiyati-(listeFiyati*0.15));
            }else {
                System.out.println(listeFiyati-(listeFiyati*0.1));
            }
        }






    }
}
