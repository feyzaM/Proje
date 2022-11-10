package nurfeyza;

public class Soru_Loop {
    public static void main(String[] args) {

        //120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız

        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 || i % 6 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("");

        String s = "";
        Integer i=120;
        while(i>10) {
            if (i % 4 == 0 && i % 6 == 0) {
                s = s + i + " ";
            }
            i--;


        }
        System.out.print(s);

        String f = "";
        Integer j=120;
        do{
            if(i%4==0 && i%6==0){
                f = f + j+ " ";
            }
            j--;
        }while(j>10);
        System.out.println(f);


    }
}
