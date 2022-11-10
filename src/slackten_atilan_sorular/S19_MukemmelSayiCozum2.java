package slackten_atilan_sorular;

public class S19_MukemmelSayiCozum2 {
    public static void main(String[] args) {
        int sayi=16;
        int toplam=0;

        //i===> bolen
        //j==> bolum

        for (int i = 1; i <=sayi/2 ; i++) {
            for (int j = 1; j <=sayi ; j++) {
                if (i*j==sayi){
                    toplam+=i;
                    System.out.println(i);
                }
            }
        }
        if (sayi==toplam){
            System.out.println(sayi + " mukemmel sayidir");
        }else{
            System.out.println(sayi + " mukemmel sayi degildir");
        }
    }




}
