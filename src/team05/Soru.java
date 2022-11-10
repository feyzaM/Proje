package team05;

public class Soru {
    public static void main(String[] args) {

        //Klavyeden okunan bir integer sayıyı basamak basamak ve tersten ekrana yazdıran
       // bilgisayar programını yazınız.

        int sayi=1453;

       // String str=String.valueOf(sayi);
        String str= ""+sayi;
        String tersStr="";
        int yeniSayi=0;




        for (int i =str.length()-1; i >=0 ; i--) {
            tersStr+=str.charAt(i);
             yeniSayi=Integer.valueOf(tersStr);
        }

        System.out.println(yeniSayi);




        }
    }

