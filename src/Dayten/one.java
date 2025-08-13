package Dayten;

import java.util.Random;

public class one {
    public static void main(String[] args) {
        System.out.println(createCode(5));

    }

    public static String createCode(int n){
        //1.定义一个for循环用于控制 产生多少位随机字符
        Random r = new Random();
//        3.定义一个String类型的变量用于记住产生的每位随机字符
        String code ="";

        for (int i = 1; i <= n ; i++) {
            //2.为每个位置生成有一个随机字符 可能数字 大小写字母
            int type = r.nextInt(3);
            switch (type){
                case 0:
                    //随机一个数字字符
                    code +=r.nextInt(10); //0~9
                    break;
                case 1:
                    //随机一个大写字符
                    //A 65 Z 65+25
                    char chl =(char)(r.nextInt(26)+65);
                    code +=chl;
                    break;
                case 2:
                    //随机一个小写字符
                    //随机一个小写字符 a97 z97+25
                    char ch2 = (char) (r.nextInt(26)+97);
                    code +=ch2;
                    break;
            }

        }
        return code;
    }
}
