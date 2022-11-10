package team05;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char girilenHarf=scan.next().charAt(0);
        System.out.println(""+(char)(girilenHarf+1)+(char) (girilenHarf+2)+(char) (girilenHarf+3));
    }
}
