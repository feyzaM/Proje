package nurfeyza;

import java.util.Arrays;

public class ArrayOrtadakiEleman {
    public static void main(String[] args) {
          /*Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
            Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
            (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10*/

        int[] arr = {3, 1, 4, 6, 5, 8, 9, 0};
        Arrays.sort(arr);
        int ortadakiElemanIndexi= arr.length/2;
        if (arr.length%2!=0){
            int ortadakiEleman1=arr[ortadakiElemanIndexi];
            System.out.println(ortadakiEleman1);
        }else {
          int ortadakiEleman2=(arr[ortadakiElemanIndexi]+arr[ortadakiElemanIndexi-1])/2;
            System.out.println(ortadakiEleman2);
        }


    }


}

