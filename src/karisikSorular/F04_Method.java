package karisikSorular;

public class F04_Method {
    public static void main(String[] args) {

        /*
         * String parametreli bir metod yazin ve  girililen String icindeki digitlerin
         * toplamini dondursun.
         *
         * Ornek
         * input : ade1r4d3
         * output : 8
         *
         * Ipucu:
         *     Character.isDigit()
         *     Integer.valueOf()
         */
        String str="java1235";
        String yeniStr=str.replaceAll("\\D","");

        int rakamlatToplami=0;
        for (int i = 0; i <yeniStr.length() ; i++) {
            int rakamlar=Integer.valueOf(yeniStr.substring(i,i+1));

            rakamlatToplami=rakamlatToplami+rakamlar;

        }
        System.out.println(rakamlatToplami);

        System.out.println(rakamMethodu(str));


    }


    public static int rakamMethodu(String str){
        String yeniStr=str.replaceAll("\\D","");

        int rakamlatToplami=0;
        for (int i = 0; i <yeniStr.length() ; i++) {
            int rakamlar=Integer.valueOf(yeniStr.substring(i,i+1));

            rakamlatToplami=rakamlatToplami+rakamlar;

        }

        return rakamlatToplami;

    }





}


