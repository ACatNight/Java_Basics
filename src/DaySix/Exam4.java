package DaySix;

import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        //✅ 二、if 和 for 题（共 3 题）
        //题目 4：分段成绩判断
        //编写程序，接收一个 0~100 的分数，判断对应的等级：
        //
        //90~100：优秀
        //
        //70~89：良好
        //
        //60~69：及格
        //
        //0~59：不及格
        //
        //其他：输出“输入有误”
        System.out.println("请输入0~100 的分数判断你的等级");
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        if (date <= 59){
            System.out.println("该分数段不及格");
        }else if(date >= 60 && date <= 69){
            System.out.println("该分数段及格");
        }else if(date >= 70 && date <= 89){
            System.out.println("该分数段良好");
        }else if(date >= 90 && date <= 100){
            System.out.println("该分数段优秀");
        }else {
            System.out.println("请重新输入");
        }
    }
}
