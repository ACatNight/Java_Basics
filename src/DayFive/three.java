package DayFive;

public class three {
    public static void main(String[] args) {
        //目标 搞清楚循环嵌套的执行流程
        //场景 你有老婆 你犯错了 你老婆罚你说3天 每天说五句我爱你
        for (int i = 1; i <= 3; i++) {
            //i = 1 2 3
            for (int j = 1; j <= 5; j++) {
                System.out.println("我爱你" + i);

            }
            System.out.println("-------");
        }
        /**
         *  ****
         *  ****
         *  ****
         */
        for (int i = 1; i <= 3; i++) {
            //打印三行
            //定义一个循环控制每行打印多个星星
            for (int j = 1; j <= 4 ; j++) {
                System.out.print("*");  //println 换行

            }
            System.out.println();
        }
    }
}