package slackten_atilan_sorular;

import java.util.Scanner;

public class S08_MukemmelSayi {
    /*Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
    //Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
    //herhangi bir sayı Mükemmel Sayı olarak bilinir.
    //Input :6
    //Output:6 Mukemmel Sayidir.
    //======================
    //Input7
    //Output:	7 Mukemmel Sayidir degildir.

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();
        int tamBolenToplam=0;


        for (int i = 1; i <=sayi/2 ; i++) {
            if (sayi%i==0){
                tamBolenToplam=tamBolenToplam+i;

            }

        }
        System.out.println("tam bolen sayilarin toplami :" + tamBolenToplam);

        if (sayi==tamBolenToplam){
            System.out.println(sayi + " bir mukemmel sayidir");
        }else{
            System.out.println(sayi + " mukemmel sayi degildir");
        }

    }
}
