package nurfeyza;

public class nuropo06 {
    public static void main(String[] args) {

        //Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
        //Not: İkinci isim kapsam dışındadır.
        //Örnek: Tom Hanks ==> TH, Mary Star ==> MS

        String isim="Mary Star";
        String ilkHarf=isim.substring(0,1);
        int soyadIlkIndex=isim.indexOf(" ")+1;
        String soyadIlkHarf=isim.substring(soyadIlkIndex,soyadIlkIndex+1);
        System.out.println(ilkHarf+" "+soyadIlkHarf);


        //2.yol

        String isim2="Tom Hanks";
        String ilkHarf2=isim2.substring(0,1);
        String soyadIlkHarf2=isim2.split(" ")[1].substring(0,1);
        System.out.println(ilkHarf2+" "+soyadIlkHarf2);


    }


}
