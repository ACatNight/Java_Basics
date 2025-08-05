package DayThree;

import java.util.Scanner;

/**
 * 掌握switch的写法 理解执行流程
 */
public class four {
    public static void main(String[] args) {
//        String wekk = "周三";
//        switch (wekk){
//            case "周一":
//                System.out.println("吃饭");
//            case "周二":
//                System.out.println("玩手机");
//            case "周三":
//                System.out.println("继续吃饭");
//            case "周四":
//                System.out.println("继续睡觉");
//            case "周五":
//                System.out.println("打豆豆");
//            case "周六":
//                System.out.println("白嫖");
//            case "周日":
//                System.out.println("摸鱼");
//            default:
//                System.out.println("您输入的信息不存在");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的星期");
        String week = sc.next();
        switch (week){
            case "周一" :
                System.out.println("今天摸鱼吧");
                break;
            case "周二" :
                System.out.println("今天睡觉吧");
                break;
            default:
                System.out.println("今天不用干活");
                break;
        }
    }
}
