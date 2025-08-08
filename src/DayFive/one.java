package DayFive;

public class one {
    public static void main(String[] args) {
        //掌握 do while书写格式 执行流程 特点和应用场景
        int i =0;
        do{
            System.out.println("hello World");
            i++;
        }while (i < 3);

        //特点 先执行 后判断
        do {
            System.out.println("hello world2");
        }while (false);

        System.out.println("-----------------------");
        for (int j = 0; j < 3 ; j++) {
            System.out.println("hello.world");
        }
        int m = 0;
        while (m < 3){
            System.out.println("hellowrodl3");
            m++;
        }
        System.out.println(m);
    }
}
