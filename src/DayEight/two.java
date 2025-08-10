package DayEight;

public class two {
    public static void main(String[] args) {
        //掌握按照方法解决的实际业务需求不同
        printHelloWorld();
        System.out.println("----------------");
        printHelloWorld2(4);
    }

    /**
     *  无参数 无返回值方法
     */
    public static void printHelloWorld() { //无返回值
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("hello,world");
        }

    }
    /**
     *  有参数 有返回值方法
     */
    public static void printHelloWorld2(int n) { //无返回值
        for (int i = 1; i <= n ; i++) {
            System.out.println("hello,world");
        }

    }
}
