package DayFive;

import java.util.Random;
import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到猜数字游戏");
        int data = r.nextInt(100)+1;
        while (true) {
            int number = sc.nextInt();
            if (number > data){
                System.out.println("过大了");
            }else if (number < data){
                System.out.println("过小了");
            }else {
                System.out.println("恭喜你猜到了");
                break;
            }


        }
    }
}
