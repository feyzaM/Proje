package nurfeyza;

public class Soru_Loop2 {
    public static void main(String[] args) {
        //Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        // Örneğin; accessories ´ ces


        String str="accessories ";
        String bosStr="";



        for (int i = 0; i <str.length(); i++) {
            String c=str.substring(i,i+1);
            if (str.indexOf(c)!=str.lastIndexOf(c)){
                if (!bosStr.contains(c)){
                    bosStr=bosStr+c;
                }

            }

        }
        System.out.println(bosStr);
    }
}
