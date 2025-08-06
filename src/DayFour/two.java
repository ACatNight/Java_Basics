package DayFour;

public class two {
    public static void main(String[] args) {
        //掌握for循环批量产生数据
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(i);

        }
        System.out.println("-----------");
        //定义一个循环 产生1-5的数据
        int sum = 0; //定义一个变量用于求和
        for(int i = 1; i <= 100; i++ ) {
            sum += i; //sum = sum + i;
        }
            System.out.println("1~5的数据和为" + sum);
        System.out.println("------------");
        //产生1-100的奇数
        int sum2 = 0;
        for (int i = 1;i <= 100; i+=2){
            sum2 += i;
        }
        System.out.println("1-100的奇数和" + sum2);
        System.out.println("-------");
        //定义循环1-100之间的每个数据
        int sum3 = 0;
        for (int i = 1; i <= 100 ; i++) {
            //i = 1 2 3 4 5 6 ... 99 100
            //
            if (i % 2 == 1){
                sum3 += i;
            }
        }
        System.out.println("1-100的奇数和" + sum3);


    }
    }

