package nurfeyza;

public class Soru_Loop3 {
    public static void main(String[] args) {

        //bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.

        String palindrom="ey edip adanada pide ye";
        String tersStr="";

        for (int i =palindrom.length()-1; i>-1 ; i--) {

            tersStr=tersStr+palindrom.substring(i,i+1);


        }
        if (tersStr.equals(palindrom)){
            System.out.println("sen palindromsun");
        }else {
            System.out.println("palindrom degilsin");
        }
        System.out.println(tersStr);




    }
}
