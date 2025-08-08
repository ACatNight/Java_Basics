package DayFive;

import java.util.Random;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int data = r.nextInt(100) + 1;
        System.out.println("欢迎来到猜数字游戏");
        int data2 = 0;
        while (true) {
            int number = sc.nextInt();
            if (number < data) {
                System.out.println("太小了");
                data2 += 1;
            } else if (number > data) {
                System.out.println("太大了");
                data2 += 1;
            } else {
                System.out.println("恭喜猜对了总共猜了" + data2 + "次");
                break;
            }
        }
    }
}