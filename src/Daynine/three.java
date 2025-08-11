package Daynine;

public class three {
    public static void main(String[] args) {
        //需要认识方法重载 并掌握其应用场景
        test();
        test(100);
    }
    public static void test(){
        System.out.println("======test1======");
    }
    public static void test(int a){
        System.out.println("======test2======" + a);
    }
    void  test(double a){

    }
    int test(int a,int b){
        return a + b;
    }


}
