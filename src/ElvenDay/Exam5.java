package ElvenDay;

public class Exam5 {
    public static void main(String[] args) {
       int[] arr = new int[]{53, 23, 65};
       int max = getMax(arr);
        System.out.println("最大值是:" + max);

    }
    public static int getMax(int [] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > temp ){
                temp = arr[i];
            }


        }


        return temp;
    }
}
