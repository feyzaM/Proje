package nurfeyza;

public class Tekrar1 {
    public static void main(String[] args) {
        //Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        //Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
        //sembol olmalıdır.
        //Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
        // 'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
        // '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
        // '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
        // '! a b 3 k' kodunuz konsolda false yazdırmalıdır.

        String sifre="A2b!";
        boolean sifreDogru=true;

        if (sifre.replace(" ","").length()<8){
            //System.out.println("false");
            sifreDogru=false;
        }
        if (sifre.replaceAll("\\s","f").replaceAll("\\w","").length()<1){
            //System.out.println("false");
            sifreDogru=false;
        }

        System.out.println(sifreDogru);
    }
}
