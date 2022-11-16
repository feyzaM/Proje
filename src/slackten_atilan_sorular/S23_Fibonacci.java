package slackten_atilan_sorular;

import java.util.ArrayList;
import java.util.List;

public class S23_Fibonacci {
    public static void main(String[] args) {
        /*
         * Fibonacci dizisi create ediniz.
         * Sınır degeri 100
         */

        int sayi=100;
        System.out.println(fibonacci(sayi));
    }

    public static List<Integer> fibonacci(int sayi){
      List<Integer> fiboList=new ArrayList<>();

      fiboList.add(0);
      fiboList.add(1);

      int n=2;

        for (int i = 0; i <=sayi ; i++) {
            if (i==fiboList.get(n-2)+fiboList.get(n-1)){
                fiboList.add(i);

            }
        }
        return fiboList;
    }
}
