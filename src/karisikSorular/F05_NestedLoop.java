package karisikSorular;

public class F05_NestedLoop {
    public static void main(String[] args) {

        /*
        1
        2 4
        3 6 9
        4 8 12 16
        5 10 15 20 25
         */

        for (int i = 1; i <6 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i*j+" " );
            }
            System.out.println("");

        }


    }
}
