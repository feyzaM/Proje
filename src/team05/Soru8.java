package team05;

import java.util.Random;
import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        /*
          Bu örnekte bilgisayar en başta rastgele bir sayı üretecek,
          ardından döngü içerisinde kullanıcıdan sürekli sayı istenecektir. Kullanıcının girdiği sayı,
          bilgisayarın tuttuğu ile karşılaştırılarak bilemediği sürece devam edecektir.
          Ayrıca "Aşağı" veya "Yukarı" diye ipucu verilecektir.
          Bir taraftan da kullanıcının 10 kez deneme hakkı olacak ve bu hak her seferinde bir azaltılacak,
          0 olduğunda da döngü sona erecektir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 0 ve 100 arasinda bir sayi giriniz");
        int girilenSayi= scan.nextInt();

        Random rastgele = new Random();
        int rastgeleSayi = rastgele.nextInt(100);

       // System.out.println(rastgeleSayi);

        for (int i = 10; i >0 ; i--) {
            System.out.println("kalan deneme hakki :" +i);
            if (rastgeleSayi==girilenSayi){
                System.out.println("tahmin dogru");
                break;
            }else{
                System.out.println("tahmin dogru degil");
                if (rastgeleSayi>girilenSayi){
                    System.out.println("lutfen daha buyuk bir sayi giriniz");
                }else{
                    System.out.println("lutfen daha kucuk bir sayi giriniz");
                }
                System.out.println("lutfen 0 ve 100 arasinda bir sayi giriniz");
                girilenSayi= scan.nextInt();
            }

        }




    }
}
