package team05;

public class MentorSoru2 {
    /*
     * Write a java program that calculates the average value of array elements
     *
     * input[]= {1,2,3,4,5,6,7}
     *
     * Output : 4

     */
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};

        arrayOrt(arr);
    }
    public static void arrayOrt(int[] arr){

        int toplam=0;
        int ort=0;
        for (int i = 0; i < arr.length ; i++) {
            toplam=toplam+arr[i];

        }
        ort=toplam/arr.length;
        System.out.println("elemanlarin ortalamasi :" + ort);
    }
}
