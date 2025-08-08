package DayFive;

import java.util.Random;

public class five {
    public static void main(String[] args) {
        //掌握使用Random生成随机数的步骤
        //1.导包
        //2.创建一个Random对象
        Random r = new Random();
        for (int i = 0; i <= 20; i++) {
            int data = r.nextInt(10); //0-9
            System.out.println("当前随机的数字为" + data);
        }
        System.out.println("------------------------------------");
//        掌握1-10之间的随机数
        for (int i = 1; i <= 20 ; i++) {
            int data2 = r.nextInt(10)+1;
            System.out.println(data2);

        }
        //65-91
        for (int i = 1; i <= 10 ; i++) {
            int data3 = r.nextInt(91-65+1)+65;
            System.out.println(data3);
        }

    }
}
