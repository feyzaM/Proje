package nurfeyza;

public class StringArrayBasHarf {
    public static void main(String[] args) {
        /*
        String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
alınız.
Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJ
         */

        String[] arr={ "Kemal", "Jonathan", "Mark", "Jackson", "Ali" };
        String basHarfler="";

        for (String w:arr) {
            if (w.endsWith("n")==true || w.endsWith("k")==true){
                basHarfler=w.substring(0,1);
                System.out.print(basHarfler);
            }

        }

    }
}
