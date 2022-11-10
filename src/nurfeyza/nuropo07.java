package nurfeyza;

public class nuropo07 {
    public static void main(String[] args) {

        //Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.

        String cumle = "Vay be! Ali 13 yasinda ama universite ogrencisi.";
        String yeniCumle=cumle.replaceAll("\\s","f")
                .replaceAll("\\d","f");
        String enYeniCumle=yeniCumle.replaceAll("\\w","");
        int noktalamaSayisi=enYeniCumle.length();

        System.out.println(noktalamaSayisi);




    }
}
