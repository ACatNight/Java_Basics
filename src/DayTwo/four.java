package DayTwo;

public class four {
    public static void main(String[] args) {
        //目标 掌握i扩展赋值运算符的使用
        // +=
        //需求 收红包
        double a = 9.5;
        double b = 520;
        a += b; //        a = a + b;
        System.out.println(a);
        //-= 发红包
        double i = 600;
        double j = 520;
        i -= j;  // i = i - j;
        System.out.println(i);

        System.out.println("---------------------");
        byte x = 10;
        byte y = 30;
       // x = x + y 编译报错
       // x = (byte)(x + y);
        x += y;
        System.out.println(x);


//        int m = 10;
//        int n = 5;
////        m /= n; m =(int)(m / n)
//        System.out.println(m);
////        m *= n;  m = (int)(m * n)


    }
}
