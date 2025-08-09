package Dayseven;

public class four {
    public static void main(String[] args) {
        int [] date ={10 , 20 , 30 , 40 , 50};
        for (int i = 0 ,j = date.length - 1; i < j ; i++,j--) {
            int temp = date [j]; //定义临时变量
            date [j] = date[i]; //把左边的值（date[i]）放到右边位置。
            date[i] = temp;  //然后再把临时变量存到date[i]
        }
        for (int i = 0; i < date.length ; i++) {
            System.out.println(date[i]);
        }

    }
}
