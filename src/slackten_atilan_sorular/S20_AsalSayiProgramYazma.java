package slackten_atilan_sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S20_AsalSayiProgramYazma {
    public static void main(String[] args) {
        /*
         * Write a program that accepts an integer as input and prints first 10 prime
         * numbers greater than input Check numbers if they are even or not in a return
         * method.
         *
         * Input : 5
         *
         * Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
         */
        //Girdi olarak bir tamsayı kabul eden ve ilk 10 asal sayıyı yazdıran bir program yazınız.
         // Girilenden büyük sayılar Bir dönüşte sayıların çift olup olmadığını kontrol edin
                //yöntem.

        int sayi=1;
        int sayac=0;
        List<Integer> asalSayilar=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        sayi= scan.nextInt();

        for (int i = sayi+1; i <=sayi*10 ; i++) {
            sayac=0;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    sayac=1;
                    break;
                }
            }
            if (sayac==0 && asalSayilar.size()<10){
                asalSayilar.add(i);
            }
        }
        System.out.println(asalSayilar);


    }
}
