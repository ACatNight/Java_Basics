package DayOne;
//        数据类型 变量名称 = 数据
/*          |     |      赋值
                 首字母建议小写
            |
            int 整型 double 小数类型
             注意 =在Java中是赋值的意思 从右往左
* */
public class four {
    public static void main(String[] args) {
        int age = 12;
        System.out.println(age);
        double score = 44.2;
        System.out.println(score);
        System.out.println("------------------------");
//        只用变量的好处 便于扩展和维护
        int number = 999;
        System.out.println(number);
        System.out.println("--------------");
/*        int age2 = 12;  //变量特点  变量中装的数据是可替换的
        age2 = 19;
        System.out.println(age2);
        age2 = age2 + 1;
        System.out.println(age2);*/
        //
        // 需求 钱包有9，5元  收到10 元 又才发出去5元 请各输出钱包的情况
        double money = 9.5;
        System.out.println(money);
        money = 9.5 + 10;
        System.out.println(money);
        money = money - 5;
        System.out.println(money);
    }
}
