package nurfeyza;

public class nuropo05 {

    public static void main(String[] args) {

        //) String gomlekFiyat = ‘$12.99’;
        //String kitapFiyat = ‘$35.99’;
        //Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız

        String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";

        String g=gomlekFiyat.replace("$","");
        String k=kitapFiyat.replace("$","");
        double x=Double.valueOf(g);
        double y=Double.valueOf(k);

        System.out.println("toplam fiyat :" +( x+y));


    }
}
