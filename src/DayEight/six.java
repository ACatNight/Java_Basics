package DayEight;

public class six {
    public static void main(String[] args) {
        //目标 理解方法的参数 传递机制 值传递
        int a = 10;
        change(a);
        System.out.println(a);//10
    }
    public static void change(int a){
        System.out.println(a); //10
        a = 20;
        System.out.println(a);//20
    }
}
