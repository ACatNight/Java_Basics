package ElvenDay;

public class two {
    public static void main(String[] args) {
        int rs =search(101,200);
        System.out.println("当前素数的个数是:" + rs);

    }
    public static int search(int start,int end){
        int count = 0;
        for (int i = start; i <= end  ; i++) {
            //信号位思想
            boolean flag = true; //假设的意思 默认认为当前i记住的数是素数
            //判断当前i记住的这个数据是否是素数
            for (int j = 2; j <= i/2 ; j++) {
                if (i % j == 0){
                    //i当前记住的这个数据不是素数
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
                count++;
            }


        }
        return count;
    }
}
