package DaySix;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        //题目 2：动态数组输入并求平均
        //让用户依次输入 6 个学生的分数（double 类型），保存到数组中，并输出平均分（保留 2 位小数）。
        double dates[] = new double[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < dates.length ; i++) {
            System.out.println("请输入当前第" + (i + 1) + "个学生");
            dates[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < dates.length ; i++) {
            sum += dates[i];
        }
        System.out.println("学生分数平均分为:" + sum / dates.length);

    }
}
