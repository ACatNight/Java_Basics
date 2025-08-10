package DayEight;

public class three {
    public static void main(String[] args) {

        //搞清楚使用方法时的常见问题
//        1.方法在类中的位置前放后无所谓，但一个方法不能定义在另一个方法里面
//    public static void  printWorld(){
//
//    }
        //2.方法的返回值类型写void(无返回值申明)，不能使用return返回数据,如果方法返回值类型写了具体类型
        // 方法内部必须使用return返回对应类型的数据 return语句的下面 不能编写代码 属于无效的代码 执行不到这

        //3.return语句下面不能编写代码 属于无效的代码 执行不到这里

        //4.方法不调用 就不会执行 调用方法时 传输方法的数据 必须严格匹配方法的参数情况
        printWorld();

        //5.调用有返回值的方法
        //调用有返回值方法 有3种方式 1.可以定义变量接收结果 2.或者直接输出调用 3.还可以直接调用
        int rs = sum(10,20);
        System.out.println(rs);
        //直接输出调用
        System.out.println(sum(10, 90));
        //6.调用无返回值的方法
        //调用无返回值方法 有 1种方式 1.只能直接调用
        printWorld();



    }
    public static void  printWorld(){
        for (int i = 0; i <= 3; i++) {
            System.out.println("helloworld");
        }

    }
    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }
}
