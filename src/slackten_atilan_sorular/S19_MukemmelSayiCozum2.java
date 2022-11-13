package slackten_atilan_sorular;

public class S19_MukemmelSayiCozum2 {
    public static void main(String[] args) {

        /*
        Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
        //Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
        //herhangi bir sayı Mükemmel Sayı olarak bilinir.
        //Input :6
        //Output:6 Mukemmel Sayidir.
        //======================
        //Input7
        //Output:   7 Mukemmel Sayidir degildir.
         */

       int input=6;
       int tamBolenToplam=0;
       //i==>bolen
        //j==>bolum

        for (int i = 1; i <=input/2 ; i++) {
            for (int j = 1; j <=input ; j++) {
                if (i*j==input){
                    tamBolenToplam+=i;
                    System.out.println(i + " bir tam bolendir");
                }
            }
        }
         if (input==tamBolenToplam){
             System.out.println(input + " mukemmel sayidir");
         }else{
             System.out.println(input + " mukemmel sayi degildir");
         }


    }
}
