package ElvenDay;

public class Exam2 {
    public static void main(String[] args) {
        boolean isEven =isEven(11) ;
        if (isEven){
            System.out.println("是偶数");

        }else{
            System.out.println("是奇数");
        }
    }
    public static boolean isEven(int num){
        if (num % 2 ==0){
            return true;
        }else {
            return false;
        }
    }
}
