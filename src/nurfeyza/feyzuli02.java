package nurfeyza;

public class feyzuli02 {
    public static void main(String[] args) {
        //bir stringin basinda buyuk harf ve sonnda nokta olup olmadigini kont etmek icin kod yaz

        String yeni="Hulya Avsar";

        char ilkHarf=yeni.charAt(0);//ilk harf

        char sonYeni=yeni.charAt(yeni.length()-1);//son harf

        boolean ilkHarfBuyukMu=ilkHarf>='A' && ilkHarf<='Z';

        boolean sonHarfNoktaMi=ilkHarf=='.';

        System.out.println("ilk harf buyuk mu :" + ilkHarfBuyukMu + "\n" +
                "son karakter nokta mi :" + sonHarfNoktaMi);
    }
}
