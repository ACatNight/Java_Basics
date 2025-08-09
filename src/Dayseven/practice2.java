package Dayseven;

public class practice2 {
    public static void main(String[] args) {
        int [] date = {1,2,3,4,5};
        int max = date[0];
        for (int i = 1; i < date.length ; i++) {
            if (date[i] > max){
                max = date[i];
            }
        }
        System.out.println(max);
    }
}
