package DaySix;

import java.util.Scanner;

public class five2 {
    public static void main(String[] args) {
        double[] scores = new double[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入当前第" + (i + 1) + "的分数");
            scores[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("当前选手的总分为" + sum / scores.length);

    }
}
