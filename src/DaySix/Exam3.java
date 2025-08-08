package DaySix;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        //题目 3：找出数组中的最大值
        //编写一个程序，接收用户输入 5 个整数，保存到数组中，并输出其中的最大值。
        int dates [] = new int [5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < dates.length; i++) {
            System.out.println("请输入当前第" + (i + 1) + "整数");
            dates[i] = sc.nextInt();
        }
        int max = dates[0];
        for (int i = 0; i < dates.length; i++) {
            if (dates[i] > max){
                max = dates[i];
            }
        }
        System.out.println("当前最大值为" + max);
    }
}
