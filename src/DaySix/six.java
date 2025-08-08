package DaySix;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        //定义一个动态初始化的数据 负责后期存储6个评委的打分
        double[] scores = new double[6];
        Scanner sc = new Scanner(System.in);
        //遍历数组中的每个位置 录入评委的分数
        for (int i = 0; i < scores.length ; i++) {
            System.out.println("请您输入当前第" + (i + 1) + "个评委的分数:");
            double score = sc.nextDouble();
            scores [i] = score;
        }
        //遍历数组中的每个元素进行求和
        double sum = 0;
        for (int i = 0; i < scores.length ; i++) {
            sum += scores[i];
        }
        System.out.println("选手的最终总分" + sum / scores.length);


    }
}