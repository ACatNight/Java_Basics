package DayFive;

public class four {
    public static void main(String[] args) {
//掌握break和continue的作用
        //1.break 跳出并结束 当前所在循环的执行
        for (int i = 1; i <=5 ; i++) {
            System.out.println("我爱你");
            if (i == 3){
                System.out.println("别再说了");
                break;
            }
        }
        //2.contive 跳出当前循环的当次执行 直接进入循环的下一次执行
        for( int i = 1; i <= 5 ; i++){
            if (i == 3){
                continue;
            }
            System.out.println("洗碗" + i);
        }

    }

}
