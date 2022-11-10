package nurfeyza;

import java.util.Arrays;
import java.util.Scanner;

public class Nuropo14 {
    public static void main(String[] args) {
        // bir ogretmenin sinifindaki ogrencilerinin isimlerini application`a yuklemesini saglayan kodu yaziniz
        //[Kullanici ile ebraber bir array olusturunuz ve icine data ekleyiniz.(javaca)]

        Scanner scan=new Scanner(System.in);

        System.out.println("ogrenci sayisini girin");
        int ogrenciSayisi= scan.nextInt();

        System.out.println("lutfen islemi sonlandirmak icin q ya basin");
        String isim[]=new String[ogrenciSayisi];

        for (int i = 1; i <ogrenciSayisi+1 ; i++) {

            System.out.println("lutfen " + i + "ogrencinin ilk ismini giriniz");
            String ogrenciIsim=scan.next();
            if (ogrenciIsim.equalsIgnoreCase("q")){
                break;
            }

            isim[i-1]=ogrenciIsim;

        }
        System.out.println(Arrays.toString(isim));
    }
}
