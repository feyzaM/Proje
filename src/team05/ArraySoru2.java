package team05;

public class ArraySoru2 {
    public static void main(String[] args) {
        /*
         * Write a method which accepts a String as parameter and prints the sum of the
         * digits, present in the given string.
         *
         * input : ade1r4d3
         *
         * output : 8
         *
         * Hint : Use Character.isDigit() Integer.valueOf()
         */

        String input=" ade1r4d3";
        rakamlariToplama(input);






    }
    public static void rakamlariToplama(String input){
        input=input.replaceAll("\\D","");
        int sonuc=0;
        sonuc=Integer.valueOf(input);
        System.out.println(input);

        int toplam=0;
        int birlerBasamagi=0;

        for (int i = 0; i <input.length(); i++) {

            birlerBasamagi=sonuc%10;

            toplam+=birlerBasamagi;


            // toplam=toplam+birlerbasamagi;
            // toplam+=birlerbasamagi;
            sonuc=sonuc/10;


        }
        System.out.println(toplam);





    }
}
