package Dayten;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        System.out.println(getscores(5));

    }
    public static double getscores(int n){
        Scanner sc = new Scanner(System.in);
        int [] scores = new int [n];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请录入第" + (i + 1) + "个选手的分数");
            int score = sc.nextInt();
            scores [i] = score;
        }
        System.out.println("录入完成");
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < scores.length ; i++) {
            int score = scores[i];
            sum += scores[i];
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        return 1.0 * (sum - max - min) / (n - 2);
    }
}
