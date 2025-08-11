package Daynine;

public class two {
    public static void main(String[] args) {
        int[] arr = {10,30,50,70};
        data(arr);



    }
    public static void data(int [] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i ==arr.length - 1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }

        }
        System.out.print("]");

    }
}
