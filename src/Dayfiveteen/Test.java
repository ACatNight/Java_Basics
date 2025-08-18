package Dayfiveteen;

public class Test {
    public static void main(String[] args) {
        //认识构造器
        one s = new one("波仔",12);
        one s1 = new one();
        s1.name = "测试";
        s1.score = 100;

        one s2 = new one("小黑",42);
        System.out.println(s2.score);
        System.out.println(s2.name);

        two t = new two(1);//如果你没写构造器 java会自动帮你生成一个无参数构造器
        t.score = 12;
        System.out.println(t.score);

    }
}
