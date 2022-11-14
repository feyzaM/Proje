package nurfeyza;

public class StringArrayUzunluk {
    public static void main(String[] args) {
        /*
        String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Vel
         */

        String[] arr={"Kemal", "Jonathan", "Mark", "Angie", "Veli" };
        String bos=arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i].length()<=bos.length()){
                bos=arr[i];
                System.out.println(bos);
            }
        }
        System.out.println("");
        //2.yol
        int minLength=arr[0].length();

        for (String w:arr
             ) {
            minLength=Math.min(minLength,w.length());
        }
        for (String w:arr
             ) {
            if (minLength==w.length()){
                System.out.println(w);
            }

        }


    }
}
