package DayThree;
import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        //1.导包 一般不用自己做 idea工具会自己导
        Scanner sc = new Scanner(System.in);
        //开始调用sc的功能 来接收用户键盘的数据
        System.out.println("请您输入您的年龄");
        int age = sc.nextInt();//执行在这 会开始等待用户输入一个整数 知道用户 按下回车键 才开始接受数据
        System.out.println("您的年龄是" + age);
        System.out.println("请输入您的名字" );
        String name =sc.next(); //等待用户输入一个名字
        System.out.println("欢迎" + name + "进入系统");

    }
}
