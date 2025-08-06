package DayFour;

public class one {
    public static void main(String[] args) {
        //掌握for循环书写格式 并且理解执行流程
        //需求 打印多行 hello world
        /**
         *  流程
         *  首先会执行初始化语句 int i = 0;
         *  i = 0 判断循环条件 0< 3 放回true 计算机会进入导循环中执行输出第一行 Helloworld 接着执行语句i++
         *  i = 1 判断循环条件 1< 3 放回true 计算机会进入导循环中执行输出第一行 Helloworld 接着执行语句i++
         *  ....
         */
        for (int i = 0; i < 3; i++) {
                //i = 0  1  2  3
            System.out.println("hello,world");
        }
        System.out.println("--------------");
        for (int i = 1; i <= 5 ; i++) {

            System.out.println("hello world");

        }
        System.out.println("--------------");
        for (int i = 1; i <= 10 ; i+= 2) {
            //1 3 5 7 9
            System.out.println("Hello world 3");

        }
    }
}
