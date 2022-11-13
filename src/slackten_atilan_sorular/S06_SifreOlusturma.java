package slackten_atilan_sorular;

import java.util.Scanner;

public class S06_SifreOlusturma {
  /*  bir sifre olusturunuz ozellikleri sirasi ile soyle olmalidir;
 1_uzunlugu => en az 10 karakter(chars) olmalidir
 2_en az 1 sembol bulundurmali
 3_en az 1 numara bulundurmali
 4_en az buyuk harf olmalidir
 5_en az bir kucuk harf olmalidir

   */
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("lutfen bir sifre giriniz");
      String sifre=scan.next();
      String sembol="/*-+,.?=-_[]/()&+$#£";
      String numara="0123456789";
      int sayac=0;

      if (sifre.length()<10){
          System.out.println(" sifrenin uzunlugu => en az 10 karakter(chars) olmalidir");
      }
      for (int i = 0; i <sembol.length() ; i++) {
          if (sifre.contains(sembol.substring(i,i+1))){
              sayac++;
          }
      }
      if (sayac==0){
          System.out.println("sifre en az bir sembol bulundurmali");
      }
      sayac=0;
      for (int i = 0; i <numara.length() ; i++) {
          if (sifre.contains(numara.substring(i,i+1))){
              sayac++;
          }
      }
      if (sayac==0){
          System.out.println("en az 1 numara bulundurmali");
      }
      sayac=0;
      for (int i = 0; i <sifre.length() ; i++) {
          if (sifre.charAt(i)<90 && sifre.charAt(i)>65){
          sayac++;
          }
      }
      if (sayac==0){
          System.out.println("sifrede en az bir buyuk harf olmalidir");
      }
      sayac=0;
      for (int i = 0; i <sifre.length() ; i++) {
          if (sifre.charAt(i)<122 && sifre.charAt(i)>97){
              sayac++;
          }
      }
      if (sayac==0){
          System.out.println("sifrede en az bir kucuk harf olmalidir");
      }

  }
}
