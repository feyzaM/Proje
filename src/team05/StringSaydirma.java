package team05;

import java.util.Arrays;

public class StringSaydirma {
    public static void main(String[] args) {
        /*
         Count the words in a String one by one Girilen bir String'deki kelimeleri tek
         tek saydiran java code create ediniz.

         For Example: Input : String is "Ali came to school and Ayse came to school"
         Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
         */

        String str="Ali came to school and Ayse came to school";

        String[] str2=str.split(" ");
        System.out.println(Arrays.toString(str2));
        int sayac=0;

        for (int i = 0; i <str2.length ; i++) {
            sayac=0;
            for (int j = 0; j <str2.length ; j++) {
                if (str2[i].equals(str2[j])){
                    sayac++;

                }

            }

            System.out.print(str2[i] + " " + sayac +" ");

        }

    }
}
