package Dayten;

import java.util.Random;

public class two {
    public static void main(String[] args) {
        System.out.println(createcode(5));
    }
    public static String createcode(int n){
        Random r = new Random();
        String code ="";
        for (int i = 1; i <= n ; i++) {
            int type = r.nextInt(3);
            switch (type){
                case 0:
                    int chl1 =r.nextInt(10);
                    code += chl1;
                    break;
                case 1:
                    char chl2 =(char)(r.nextInt(25)+65);
                    code += chl2;
                    break;
                case 2:
                    char chl3 = (char) (r.nextInt(25)+97);
                    code +=chl3;
                    break;

            }
        }
        return code;

    }

}