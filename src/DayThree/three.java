package DayThree;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        //掌握if分支三种形式的用法和执行流程
        //需求 测量用户体温 发现体温高于37度就报警
//        double t = 38.9;
//        if (t > 37){
//            System.out.println("这个人的温度异常");
//        }
//        //需求2 发红包 你的钱包是99元 现在发90元
//        //如果钱够触发发钱包的动作 如果不够 则提示钱包不足
//        int money = 23;
//        if (money >= 90){
//            System.out.println("已发出");
//        }else{
//            System.out.println("钱包额度不足");
//        }

        //需求3. 某个公司有一个绩效系统 根据员工的打分输出对应绩效级别
        //0-60 D
        //60-80 C
        //80 - 90 B
        //90 - 100 A
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的分数");
        int mark = sc.nextInt();
        if (mark >= 0 && mark < 60){
            System.out.println("您的分数为D");
        }else if (mark >= 60 && mark < 80){
            System.out.println("您的分数为C");
        }else if (mark >= 80 && mark < 90){
            System.out.println("您的分数为B");
        }else if (mark >= 90 && mark <= 100){
            System.out.println("您的分数为A");
        }else {
            System.out.println("您的分数录入错了");
        }



    }

}
