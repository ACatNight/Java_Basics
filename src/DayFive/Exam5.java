package DayFive;

import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户");
        String user = sc.next();
        System.out.println("请输入密码");
        int pin = sc.nextInt();
        int data = 0;
        while (true){
            if (user == "admin" && pin == 123456){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("登录失败");
                data = data + 1;
                if (data == 3){
                    System.out.println("登录失败请稍后再尝试");
                    break;
                }
            }
        }
    }
}
