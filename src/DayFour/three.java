package DayFour;


public class three {
    public static void main(String[] args) {
        //掌握while循环书写格式 以及理解其执行流程
        //打印多行hello world
        int i = 0;
        while (i < 5) {
            System.out.println("hello world");
            i++;
        }
        double height = 8848860;
        double paper = 0.1;
        int count = 0;
        while (paper < height) {
            paper = paper * 2;
            count++;
        }
        System.out.println("该纸张需要折叠" + count + "次数");


    }
}