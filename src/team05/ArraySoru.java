package team05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySoru {
    public static void main(String[] args) {
        /*
         * Write a method that accepts an integer array as input and prints the minimum
         * and the maximum numbers from given array
         *
         * Input : {-1,3,2,5,4,1,6,-2}
         *
         * Output :
         *
         * min: 1
         *
         * max: 6
         */
        int[] arr={-1,3,2,5,4,1,6,-2};
        minMaxDegerBulma(arr);

    }
    public static void minMaxDegerBulma(int[] arr){

        Arrays.sort(arr);

        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

    }
}
