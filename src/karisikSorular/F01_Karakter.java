package karisikSorular;

import java.util.Scanner;

public class F01_Karakter {
    public static void main(String[] args) {
        /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcuk tek sayida karaktere sahip olacak ve en az 3 karaktere sahip olacak
		* kelimenin ortasindaki karakteri yazdirin.
		*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String girilenKelime=scan.next();
        int kelimeKrkSayisi=girilenKelime.length();

        if (kelimeKrkSayisi%2!=0 && kelimeKrkSayisi>=3){
            System.out.println(girilenKelime.charAt(kelimeKrkSayisi/2));
        }




    }
}
