package nurfeyza;

public class Nur15DoWhileLoop {
    public static void main(String[] args) {
        //ex-1; Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz

       double sayi=25.5642;

       String str=String.valueOf(sayi);
       String str2=str.split("\\.")[1];

       int intSayi=Integer.valueOf(str2);

       int toplam=0;

       do {
           toplam=toplam+intSayi%10;
           intSayi=intSayi/10;

       }while (intSayi>0);
        System.out.println(toplam);











    }
}
