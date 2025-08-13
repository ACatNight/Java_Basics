package ElvenDay;

import java.util.Random;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        int [] moneys = {11,234,6435,76};
        start(moneys);


    }
    public static void start(int moneys []){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= moneys.length ; i++) {
            System.out.println("请输入任意键完成抽奖");
            int index = r.nextInt(moneys.length);
            int money = moneys[index];
            if (money != 0){
                System.out.println("抽中了" + money);
                moneys[index] = 0;
                break;
            }




        }
    }

}
