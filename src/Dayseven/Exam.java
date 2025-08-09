package Dayseven;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data;
        int amount = 0;
        String[] datas = new String[5];
        int[] codes = new int[5];
        boolean running = true;
        while (running) {
            System.out.println("===============================");
            System.out.println("    欢迎进入员工管理系统   ");
            System.out.println("===============================");
            System.out.println("1. 录入员工信息\n" +
                    "2. 统计员工数量\n" +
                    "3. 打印员工列表\n" +
                    "4. 退出系统");

            data = sc.nextInt();

            switch (data) {
                case 1:
                    for (int i = 0; i < datas.length; i++) {
                        System.out.println("请输入第" + (i + 1) + "名员工姓名:");
                        String data1 = sc.next();
                        datas[i] = data1;
                        System.out.println("录入成功");
                        amount = amount + 1;
                    }
                    for (int i = 0; i < codes.length; i++) {
                        System.out.println("请输入员第" + (i + 1) + "个工号:");
                        int code = sc.nextInt();
                        codes[i] = code;
                        System.out.println("录入成功");
                    }
                    break;

                case 2:
                    System.out.println("当前在职员工数量为：" + amount);
                    break;

                case 3:
                    System.out.println("员工列表：");
                    System.out.println("序号    姓名         工号");
                    System.out.println("-----------------------------------");
                    for (int i = 0; i < datas.length; i++) {
                        System.out.println((i + 1) + "      " + datas[i] + "       " + codes[i]);
                    }

                    break;

                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("无效输入，请重新选择");
            }
        }
    }
}