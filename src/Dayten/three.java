package Dayten;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        System.out.println("当前选手得分是" + gerAverageScore(6));
    }
    public static double gerAverageScore(int number){
        int [] scores = new int[number];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("请录入第" + (i + 1) + ("个评委的分数"));
            int score = sc.nextInt();
            scores[i] = score;
        }
        int sum = 0; //求总分
        int max = scores[0]; //最大值
        int min = scores[0];//最小值
        for (int i = 1; i < scores.length; i++) {
            int score = scores[i];
            sum += score;
            if (score > max){
                max = score;
            }
            if (score < min){
                min = score;
            }

        }

        return 1.0 * (sum - min - max) / (number - 2);
    }

}