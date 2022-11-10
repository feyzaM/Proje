package nurfeyza;

public class feyzuli01 {
    public static void main(String[] args) {
        //bir stringin basinda ve sonunda bosluk karakteri olup olmadigini kont etmek icin kod yaz

        String isim=" Gonul  ";
        String yeniIsim=isim.trim();
        boolean sonuc=yeniIsim.equals(isim);

        System.out.println("basinda ve sonunda bosluk var mi :"+ !sonuc);
    }
}
