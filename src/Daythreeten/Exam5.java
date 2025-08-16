package Daythreeten;

import java.util.Random;
import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        boolean runting = true;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int rand = r.nextInt(100) + 1;
        while (runting){
            int n = sc.nextInt();
            System.out.println("请输入猜测的数字");
            if (rand < n){
                System.out.println("您输入的范围数字太大了");
            } else if (rand > n) {
                System.out.println("您输入的范围太小了");
            }else if (rand == n){
                System.out.println("恭喜你猜对了");
                runting = false;
            }else {
                System.out.println("请您重新输入 你输入的错误");
            }

        }
        sc.close();
    }
}
