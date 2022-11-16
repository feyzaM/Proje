package slackten_atilan_sorular;

import java.util.ArrayList;

public class S22_TekrarlananKarakter {
    public static void main(String[] args) {
        /*
         Bir String'de tekrarlanan karakterleri(birden fazla olan karakterler) bulan method create ediniz

         Ör : İnput : "Java biraz bizi yordu."
         Output : Tekrar eden karakterler : a, b, i, r, z
     */

        String input = "Java biraz bizi yordu.";
        input=input.replaceAll(" ","");

        tekrarlananKrk(input);
    }
    public static void tekrarlananKrk(String input){


        String sonuc="";
        //char[] ch=input.toCharArray();

        for (int i = 0; i <input.length() ; i++) {
            for (int j = i+1; j <input.length() ; j++) {
                if (input.charAt(i)==input.charAt(j) && !sonuc.contains(input.substring(i,i+1))){
                    sonuc+=input.charAt(i)+ ",";


                }
            }
        }

        System.out.println(sonuc.substring(0,sonuc.length()-1));
    }
}
