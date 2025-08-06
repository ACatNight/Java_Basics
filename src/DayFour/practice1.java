package DayFour;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 1) {
            System.out.println(number + "是正数");
        } else if (number < 0) {
            System.out.println(number + "是负数");
        } else {
            System.out.println("是零");
        }
    }
}