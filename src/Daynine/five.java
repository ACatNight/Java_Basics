package Daynine;

public class five {
    public static void main(String[] args) {
        //掌握return 单独使用 return； 在无返回值方法的作用 跳出并立即结束当前方法执行
        System.out.println("程序开始");
        chu(10,0);
        System.out.println("程序结束");
    }
    public static void chu(int a,int b){
        if (b == 0){
            System.out.println("您的数据有问题不可以除0");
            return;//直接跳出并结束
        }
        int c = a/b;
        System.out.println("除法结果为" + c);
    }
}
