package ElvenDay;

import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a");
        int a = sc.nextInt();
        System.out.println("请输入b");
        int b = sc.nextInt();
        if (a==0 ||b == 0){
            System.out.println("除数不为0");
        }else {
            int sum = a / b;
            System.out.println(sum);
        }
    }
}