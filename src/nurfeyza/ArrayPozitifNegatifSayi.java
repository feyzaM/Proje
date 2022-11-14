package nurfeyza;

import java.util.Arrays;

public class ArrayPozitifNegatifSayi {
    public static void main(String[] args) {
        /*
        Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
bulunuz.
Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
         */


        int[] arr={-12, 18, -5, 23, -2};
        Arrays.sort(arr);
        int enKucukPozitif=arr[arr.length-1];
        int enBuyukNegatif=arr[0];

        for (int w:arr) {
            if (w > 0) {
                if (w < enKucukPozitif) {
                    enKucukPozitif = w;
                }
            }
            if (w < 0) {
                if (w > enBuyukNegatif) {
                    enBuyukNegatif = w;
                }
            }


        }
        System.out.println("en buyuk negatif :" + enBuyukNegatif +"\n en kucuk pozitif :" + enKucukPozitif);

        //2.yol
        int[] a = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a);
        for (Integer i=0;i<a.length;i++){
            if (a[i]<0 && a[i+1]>0) {
                System.out.println("Maximum negative: " + a[i]);
                System.out.println("Minimum positive: " + a[i+1]);
            }
        }



    }
}
