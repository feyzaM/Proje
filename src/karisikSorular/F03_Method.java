package karisikSorular;

public class F03_Method {
    public static void main(String[] args) {
        /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

        String str="Heeyy Jaavvaa buuguun naasiilsiinn";

        strMethodu(str);

    }

    public static void strMethodu(String str){

        String ikiciStr="";

        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.substring(i, i + 1));
            if (!ikiciStr.contains(str.substring(i, i + 1))){
                ikiciStr=ikiciStr+str.substring(i, i + 1);
            }

        }
        System.out.println();
        System.out.println(ikiciStr);
    }
}
