package nurfeyza;

import java.util.Arrays;

public class Nuropo15Array {
    public static void main(String[] args) {
        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end-(0`lari en sona koyunuz)
        //            [2, 3, 12, 0,  0,  0]

        int arr[]={0, 2, 3, 0, 12, 0};
        int brr[]=new int[arr.length];
        int brrIndex=0;

        for (int i =0; i < arr.length ; i++) {
            if (arr[i]!=0){
               brr[brrIndex]=arr[i];
               brrIndex++;
            }
        }
        System.out.println(Arrays.toString(brr));

        //2.yol


    }
}
