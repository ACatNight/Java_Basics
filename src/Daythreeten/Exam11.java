package Daythreeten;

import java.util.Scanner;

public class Exam11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 先定义学生数量（假设固定5个）
        int numStudents = 5;
        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];

        // 输入学生信息
        for (int i = 0; i < numStudents; i++) {
            System.out.println("请输入学生姓名：");
            names[i] = sc.next();

            System.out.println("请输入 " + names[i] + " 的成绩：");
            int score = sc.nextInt();
            while (score < 0 || score > 100) {
                System.out.println("成绩输入错误，请输入 0~100：");
                score = sc.nextInt();
            }
            scores[i] = score;
        }

        // 输出每个学生的成绩等级
        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i] + " " + scores[i] + " " + getGrade(scores[i]));
        }

        // 统计信息
        double avg = getAverage(scores);
        int passCount = getPassCount(scores);

        System.out.println("总人数：" + numStudents);
        System.out.println("平均分：" + avg);
        System.out.println("及格人数：" + passCount);

        sc.close();
    }

    // 计算平均分
    public static double getAverage(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return (double) sum / scores.length;
    }

    // 及格人数
    public static int getPassCount(int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                count++;
            }
        }
        return count;
    }

    // 根据成绩返回等级
    public static String getGrade(int score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }
}
