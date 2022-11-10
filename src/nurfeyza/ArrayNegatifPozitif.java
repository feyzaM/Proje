package nurfeyza;

import java.util.Arrays;

public class ArrayNegatifPozitif {
    public static void main(String[] args) {
        //ex-1: size verilen pozitif ve negatif sayilar iceren bir int arraydeki en buyuk negatif ve en kucuk pozitif
        //elemani bulunuz

        int arr[] = {-12, 18, -5, 23, -2, 0};
        Arrays.sort(arr); //{-12 ,-5 ,-2 ,0 ,18 ,23}
        int maxNegatif = arr[0]; // -12 ==>sort ettikten sonra ilk elemanlar negatif olacagindan ilk eleman secilir
        int minPozitif = arr[arr.length - 1]; // sorttan sonra son elemanlar pozitif olacagindan son elemanlar secilir
        for (int w : arr) {
            if (w < 0) {

                maxNegatif = Math.max(maxNegatif, w);//u metot paranteze girilen iki sayidan buyuk olani return eder
            }
            if (w > 0) {
                minPozitif = Math.min(minPozitif, w);

            }

        }
        System.out.println(maxNegatif + " - " + minPozitif);





    }
}
