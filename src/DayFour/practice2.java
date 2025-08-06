package DayFour;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 3 == 0){
            System.out.println(number + "能被3整除");
        }else {
            System.out.println(number + "不能被3整除");
        }
    }
}
