package Daynine;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        System.out.println("欢迎进入学生成绩管理程序");
        Scanner sc = new Scanner(System.in);
        System.out.println("请先输入学生人数");
        int count = sc.nextInt(); //人数
        String students[] = new String[count]; //new String[count] count 指的是上面的人数
        int scores[] = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("请输入第" + (i + 1) + "学生姓名");
            String student = sc.next();
            students[i] = student;
            System.out.println("请输入第" + (i + 1) + "个成绩:");
            int score1 = sc.nextInt();
            scores[i] = score1;

        }
        System.out.println("成绩统计结果为");
        System.out.println("--------------------------");
        for (int i = 0; i < count; i++) {
            String grade = getGrade(scores[i]);
            String reward = getReward(grade);
            System.out.println("姓名：" + students[i] +
                    "  成绩：" + scores[i] +
                    "  等级：" + grade +
                    "  奖励：" + reward);
        }


    }

    private static String getGrade(int score) {
        if (score >= 90 && score <= 100) {
            return "优秀";
        } else if (score >= 80) {
            return "良好";
        } else if (score >= 70) {
            return "中等";
        } else if (score >= 60) {
            return "及格";
        } else {
            return "不及格";
        }
    }
    private static String getReward(String grade){
        switch (grade){
            case "优秀":
                return "奖学金1000";
            case "良好":
                return "奖学金500元";
            default:
                return "没有奖励";

        }
}


}
