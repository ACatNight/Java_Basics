package Daythreeten;

import java.util.Random;
import java.util.Scanner;

public class Exam10 {
    public static void main(String[] args) {
        boolean runting = true;
        Random r = new Random();
        int rand = r.nextInt(50) + 1;
        int data = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个进行猜测");
        while (runting){
            int n = sc.nextInt();
            data = data + 1;
            if (data == 5){
                runting = false;
                System.out.println("很遗憾，未中奖，正确数字是" + rand);

            }
            if (n < rand){
                System.out.println("您输入的数字太小了");
            } else if (n > rand) {
                System.out.println("您输入的数字太大了");

            }else {
                System.out.println("恭喜你中奖了,你输入的次数" + data);
                runting =false;
            }
            }



        }
    }

