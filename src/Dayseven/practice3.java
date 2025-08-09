package Dayseven;

public class practice3 {
    public static void main(String[] args) {
        int [] date = {1 , 2 , 3 , 4 , 5};
        for (int i = 0 , j = date.length - 1 ;i < j ; i++ , j-- ){
            int temp = date[j];
            date[j] = date[i];
            date [i] = temp;
        }
        for (int i = 0; i < date.length; i++) {
            System.out.print(date[i] + " ");
        }

    }
}
