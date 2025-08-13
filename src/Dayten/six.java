package Dayten;

import java.util.Random;
import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        int[] moneys = {9,666,188,520,99999};
        start(moneys);

    }
    public static void start(int[] moneys){
        //money = [9,666,188,520,99999
        //         0  1   2   3  4
        // 1.定义一个for循环 控制抽奖五次
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 1; i <= 5 ; i++) {
            //提示粉丝抽奖
            System.out.println("请您输入任意内容参与抽奖");
            sc.nextInt();
            //为当前这个粉丝找一个随机红包出来
            int index = r.nextInt(moneys.length); //0 - 4
            int money = moneys[index];
            if (money != 0){
                System.out.println("恭喜您，抽中了红包" + money);
                moneys[index] = 0;
                break;//结束这次抽奖
            }

        }
        System.out.println("活动结束......");


    }
}
