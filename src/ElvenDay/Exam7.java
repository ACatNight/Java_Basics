package ElvenDay;

import java.util.Scanner;

public class Exam7 {
    public static void main(String[] args) {
        String [] frist = {"苹果","香蕉","橙子"};
        double[] prices = {3.0, 2.5, 4.0};
        double sum = 0;
        System.out.println("商品列表");
        System.out.println("苹果  " + "香蕉  " + "橙子  ");
        System.out.println("3.0  " + "2.5  " + "4.0  ");
        System.out.println("请输入输入水果名字");
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        switch (data){
            case "苹果":
                System.out.println("请输入购买数量");
                int data2 = sc.nextInt();
                    sum = data2 *prices[1];
                System.out.println("水果的总价为" + sum);
                    break;

            case "香蕉":
                System.out.println("请输入购买数量");
                int data3 = sc.nextInt();
                    sum = data3 *prices[2];
                System.out.println("水果的总价为" + sum);
                break;
            case "橙子":
                System.out.println("请输入购买数量");
                int data4 = sc.nextInt();
                sum = data4 *prices[3];
                System.out.println("水果的总价为" + sum);
                break;
            default:
                System.out.println("没有这种商品");
                break;
        }
    }
}
