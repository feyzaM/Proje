package nurfeyza;

public class feyzuli03 {

    //Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
    //Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
    //sembol olmalıdır.
    //Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
    // 'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
    // '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
    // '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
    // '! a b 3 k' kodunuz konsolda false yazdırmalıdır.

    public static void main(String[] args) {

        String sifre="feyzA* Nur55";

        boolean sekizKararkterMi=sifre.replaceAll("\\s","").length()>=8;
        boolean enAzBirSembol=sifre.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","")
                .length()>0;
        System.out.println("sifre gecerli mi :" + (sekizKararkterMi && enAzBirSembol));
    }

}
